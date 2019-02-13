package controller;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice("controller")
public class WebAppControllerAdvice {

    @ExceptionHandler({
        AuthorizationException.class
    })
    @ResponseBody
    public ResponseEntity<String> authorizationExceptionHandler(final AuthorizationException exception){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
    }

    @ExceptionHandler({
        AuthenticationException.class
    })
    @ResponseBody
    public ResponseEntity<String> authorizationExceptionHandler(final AuthenticationException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Authentication Failure");
    }

}
