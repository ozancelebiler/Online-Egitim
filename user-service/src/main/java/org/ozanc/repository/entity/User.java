package org.ozanc.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.ozanc.repository.enums.ERole;
import org.ozanc.repository.enums.EStatus;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Table(name = "user_profile")
public class User extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 5, max = 15)
    private String username;
    @Email
    private  String email;

    private  String password;

    private String name;


    @ElementCollection
    private List<Long> myCourse;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Set<ERole> roles= new HashSet<>();




    @Enumerated(EnumType.STRING)
    @Builder.Default
    private EStatus status =EStatus.PENDING;


}
