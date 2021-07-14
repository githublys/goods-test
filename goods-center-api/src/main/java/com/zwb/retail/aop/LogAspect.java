package com.zwb.retail.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by liuyong
 */
@Slf4j
@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.zwb.retail.controller..*.*(..))")
    public void expenseController() {
    }


    @Before("expenseController()")
    public void expenseWebBefore(JoinPoint joinPoint) {
        log.info("【操作日志】【请求方法】:{}", joinPoint.getSignature());
        log.info("【操作日志】【输入参数】:{}", joinPoint.getArgs());
    }

    @AfterReturning(returning = "obj", pointcut = "expenseController()")
    public void expenseWebReturning(JoinPoint joinPoint, Object obj) {
        System.out.println(joinPoint.getArgs());
    }

    @AfterThrowing(throwing = "ex", pointcut = "expenseController()")
    public void expenseWebAfterThrowing(JoinPoint joinPoint, Throwable ex) {

    }


}
