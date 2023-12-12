package com.reza.studentapplicantappapi.handler;

import com.reza.studentapplicantappapi.dto.Response;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;

@Component
public class ResponseHandlerImpl<T> implements ResponseHandler<T> {

    @Override
    public Optional<T> responseSuccess(Response payload) {
        return Optional.empty();
    }

    @Override
    public Optional<T> mapResponseSuccess(Objects payload) {
        return Optional.empty();
    }
}
