package org.ozanc.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ozanc.repository.enums.ERole;
import org.ozanc.repository.enums.EStatus;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class RegisterResponseDto {

    private String username;

    private  String email;

    private String name;

    private Set<ERole> roles;

    private EStatus status;



}
