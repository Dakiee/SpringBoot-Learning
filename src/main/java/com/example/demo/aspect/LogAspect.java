package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LogAspect {
    /**
     * Log output before executing the service.
     * Target: [UserService] is included in the class name.
     */
    @Before("execution(* *..*.*UserService.*(..))")
    public void startLog(JoinPoint jp) {
        log.info("Method start: " + jp.getSignature());
    }

    /**
     * Log output after executing the service.
     * Target: [UserService] is included in the class name.
     */
    @After("execution(* *..*.*UserService.*(..))")
    public void endLog(JoinPoint jp) {
        log.info("Method end: " + jp.getSignature());
    }
}
