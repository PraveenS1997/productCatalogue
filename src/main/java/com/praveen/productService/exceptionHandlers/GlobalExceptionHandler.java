package com.praveen.productService.exceptionHandlers;

import com.praveen.productService.dtos.ExceptionDto;
import com.praveen.productService.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleProductNotFoundException(ProductNotFoundException exception) {
        return new ResponseEntity<>(new ExceptionDto(exception.getMessage()), HttpStatus.NOT_FOUND);
    }
}