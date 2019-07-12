package top.exql.security;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionAdvice {


    @ExceptionHandler({ BadCredentialsException.class })
    @ResponseBody
    public String handleIndexOutOfBoundsException(Exception e) {
        e.printStackTrace();
        return "Exception";
    }
}
