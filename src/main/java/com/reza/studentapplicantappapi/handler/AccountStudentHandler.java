package com.reza.studentapplicantappapi.handler;

import com.reza.studentapplicantappapi.dto.AccountStudentRequest;
import com.reza.studentapplicantappapi.dto.AccountStudentResponse;
import com.reza.studentapplicantappapi.model.AccountStudent;

public interface AccountStudentHandler {

    AccountStudentRequest mapRequestToModel(AccountStudent accountStudent);

    AccountStudentResponse mapModalToResponse(AccountStudent accountStudent);

}
