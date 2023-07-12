package com.example.springaop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class UserServiceAspect {

    @Before("execution(* com.example.springaop.service.UserService.getAllUsers())")
    public void beforeLog() {
        log.info("UserService - getAllUsers() called");
    }

    @AfterReturning("execution(* com.example.springaop.service.UserService.getAllUsers())")
    public void afterReturnLog() {
        log.info("UserService - getAllUsers() completed without errors");
    }

    @After("execution(* com.example.springaop.service.UserService.getAllUsers())")
    public void afterLog() {
        log.info("UserService - getAllUsers() completed");
    }

    @AfterThrowing("execution(* com.example.springaop.service.UserService.getAllUsers())")
    public void exceptionLog() {
        log.error("UserService - getAllUsers() failed");
    }
}
