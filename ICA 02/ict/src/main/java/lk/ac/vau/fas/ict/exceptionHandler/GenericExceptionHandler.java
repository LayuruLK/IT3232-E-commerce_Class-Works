package lk.ac.vau.fas.ict.exceptionHandler;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.EntityNotFoundException;
import lk.ac.vau.fas.ict.models.ErrorResponce;

@RestControllerAdvice
public class GenericExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponce> handleEntityNotFound(EntityNotFoundException exception) {
        ErrorResponce errorResponce = new ErrorResponce(HttpStatus.NOT_FOUND.value(),exception.getMessage().toString());
        return new ResponseEntity<ErrorResponce>(errorResponce,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorResponce> handleEntityNotFound(DataIntegrityViolationException exception) {
        ErrorResponce errorResponce = new ErrorResponce(HttpStatus.NOT_FOUND.value(),exception.getMessage().toString());
        return new ResponseEntity<ErrorResponce>(errorResponce,HttpStatus.NOT_FOUND);
    }
}
