package com.example.isdp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectNumberAspect {
    @Around("@annotation(com.example.isdp.ProjectNumber)")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        String projectNumber = args[0].toString();
        System.out.println("拦截成功，项目编码是" + projectNumber);
        return pjp.proceed();
    }
}
