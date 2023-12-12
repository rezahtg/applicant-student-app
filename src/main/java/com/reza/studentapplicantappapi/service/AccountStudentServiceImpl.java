package com.reza.studentapplicantappapi.service;

import com.reza.studentapplicantappapi.dto.AccountStudentRequest;
import com.reza.studentapplicantappapi.model.AccountStudent;
import org.springframework.stereotype.Component;

@Component
public class AccountStudentServiceImpl implements AccountStudentService {
    @Override
    public AccountStudent createAccount(AccountStudentRequest accountStudentRequest) {
        return AccountStudent.builder().build();
    }
}
