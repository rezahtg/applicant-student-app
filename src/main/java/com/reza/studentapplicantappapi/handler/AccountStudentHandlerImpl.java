package com.reza.studentapplicantappapi.handler;

import com.reza.studentapplicantappapi.dto.AccountStudentRequest;
import com.reza.studentapplicantappapi.dto.AccountStudentResponse;
import com.reza.studentapplicantappapi.model.AccountStudent;
import org.springframework.stereotype.Component;

@Component
public class AccountStudentHandlerImpl implements AccountStudentHandler {
    @Override
    public AccountStudentRequest mapRequestToModel(AccountStudent accountStudent) {
        AccountStudentRequest accountStudentRequest = new AccountStudentRequest();
        return accountStudentRequest;
    }

    @Override
    public AccountStudentResponse mapModalToResponse(AccountStudent accountStudent) {
        return AccountStudentResponse.builder().build();
    }
}
