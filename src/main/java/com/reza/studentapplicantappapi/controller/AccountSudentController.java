package com.reza.studentapplicantappapi.controller;

import com.reza.studentapplicantappapi.dto.Response;
import com.reza.studentapplicantappapi.handler.AccountStudentHandler;
import com.reza.studentapplicantappapi.handler.ResponseHandler;
import com.reza.studentapplicantappapi.model.AccountStudent;
import com.reza.studentapplicantappapi.service.AccountStudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/account/student")
public class AccountSudentController {

    private final ResponseHandler responseHandler;
    private final AccountStudentHandler accountStudentHandler;
    private final AccountStudentService accountStudentService;

    @PostMapping("/create")
    public ResponseEntity<Response> createAccount(@RequestBody AccountStudent accountStudent){
        Response response = Response.builder()
                .statusCode("200")
                .message("Successful Created")
                .datas(accountStudentHandler.mapModalToResponse(accountStudentService.createAccount(accountStudentHandler.mapRequestToModel(accountStudent))))
                .build();
        log.info(response.getMessage());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
