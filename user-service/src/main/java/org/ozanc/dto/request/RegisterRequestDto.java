package org.ozanc.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RegisterRequestDto {


    @NotBlank // boş geçilmez null olamaz. String ifadeler için
    private String username;
    @Email
    private  String email;
    @Size(min =5, max = 32)
    private  String password;

    private String name;
}
