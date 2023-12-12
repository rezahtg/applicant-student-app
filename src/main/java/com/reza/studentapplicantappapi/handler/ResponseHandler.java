package com.reza.studentapplicantappapi.handler;

import com.reza.studentapplicantappapi.dto.Response;

import java.util.Objects;
import java.util.Optional;

public interface ResponseHandler<T> {

    Optional<T> responseSuccess(Response payload);

    Optional<T> mapResponseSuccess(Objects payload);

}
