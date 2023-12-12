package com.reza.studentapplicantappapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class AccountStudentRequest {

    private String fullName;
    private String username;
    private String email;
    private String password;


}
