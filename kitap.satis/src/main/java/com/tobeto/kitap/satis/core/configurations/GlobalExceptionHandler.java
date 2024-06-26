package com.tobeto.kitap.satis.core.configurations;

import com.tobeto.kitap.satis.core.utils.exceptions.proplemdetails.BusinessProblemDetails;
import com.tobeto.kitap.satis.core.utils.exceptions.proplemdetails.ValidationProblemDetails;
import com.tobeto.kitap.satis.core.utils.exceptions.types.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BusinessProblemDetails handleBusinessException(BusinessException exception) {
        BusinessProblemDetails businessProblemDetails = new BusinessProblemDetails(exception.getMessage());
        return businessProblemDetails;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValidationProblemDetails handleValidationException(MethodArgumentNotValidException exception) {
        List<String> errorMessage = new ArrayList<>();
        List<FieldError> errors = exception.getBindingResult().getFieldErrors();
        for (FieldError error : errors) {
            errorMessage.add(error.getDefaultMessage());
        }

        ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails(errorMessage);

        return validationProblemDetails;

    }


}
