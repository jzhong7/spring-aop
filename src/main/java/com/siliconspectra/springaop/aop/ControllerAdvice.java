package com.siliconspectra.springaop.aop;

import com.siliconspectra.springaop.vo.ResultBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.web.bind.annotation.ControllerAdvice
@RestController
public class ControllerAdvice {

    @ExceptionHandler
    public ResponseEntity exceptionHandler(Exception e) {
        System.out.println(e.getMessage());
        return new ResponseEntity(new ResultBean("404", e.getMessage()), HttpStatus.OK);
    }
}
