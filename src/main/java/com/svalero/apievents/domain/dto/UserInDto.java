package com.svalero.apievents.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInDto {
    private String username;
    private String name;
    private String email;
    private String password;
    private LocalDate creationDate;
}
