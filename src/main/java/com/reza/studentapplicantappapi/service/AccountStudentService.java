package com.reza.studentapplicantappapi.service;

import com.reza.studentapplicantappapi.dto.AccountStudentRequest;
import com.reza.studentapplicantappapi.model.AccountStudent;

public interface AccountStudentService {

    AccountStudent createAccount(AccountStudentRequest accountStudentRequest);

}
