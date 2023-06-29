package guia.utp.primerproyectosprintboot.primerproyectosprintboot.Web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(BadRequestException.class)
    public final ResponseEntity<ExceptionResponse> handleBadRequestException (BadRequestException exception,
                                                                              WebRequest webRequest){

        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(),exception.getMessage(),
                webRequest.getDescription(true), HttpStatus.BAD_REQUEST.getReasonPhrase());

        return new ResponseEntity<>(exceptionResponse,HttpStatus.BAD_REQUEST);
    }
}
