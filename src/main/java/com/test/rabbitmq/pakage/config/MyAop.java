package com.test.rabbitmq.pakage.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by xulei on 2019/6/6.
 */
//@Component
//@Aspect
public class MyAop {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 定义切入点，切入点为com.example.aop下的所有函数
     */
    @Pointcut("execution(* com.test.rabbitmq.pakage.contrl..*.*(..))")
    public void executeService(){}

    @Around("executeService()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        Signature signature = proceedingJoinPoint.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        java.lang.Object[] args = proceedingJoinPoint.getArgs();
        logger.info(className + "-->input:{}", "methodName="+methodName);
        try {
            Object proceed = proceedingJoinPoint.proceed();//调用执行目标方法
            return proceed;
        }catch (Throwable  e){
            e.printStackTrace();
        }
        return null;
    }
}
