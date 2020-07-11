package com.feng.mm.handler;

import com.feng.mm.exception.DaoException;
import com.feng.mm.exception.ServiceException;
import com.feng.mm.utils.ResponseEntity;
import com.feng.mm.utils.Status;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity handlerException(Exception e) {
        return ResponseEntity.error(Status.SYS_ERROR);
    }

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity handlerServiceException(ServiceException e) {
        return ResponseEntity.error(Status.SERVICE_ERROR);
    }

    @ExceptionHandler(DaoException.class)
    public ResponseEntity handlerDaoException(DaoException e) {
        return ResponseEntity.error(Status.DAO_ERROR);
    }
}
