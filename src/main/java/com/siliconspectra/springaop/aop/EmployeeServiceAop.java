package com.siliconspectra.springaop.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAop {

/*    @Around("execution(* com.siliconspectra.springaop.service.*.*(..))")
    public Object employeeServiceAround(ProceedingJoinPoint point) throws Throwable {
        long start = System.currentTimeMillis();
        Object res = point.proceed();
        long elapse = System.currentTimeMillis() - start;
        System.out.println(point.getSignature().getName() + " cost: " + elapse + " ms");
        return res;
    }*/

    @Before("execution(* com.siliconspectra.springaop.service.*.*(..))")
    public void employeeServiceBefore(JoinPoint point) {
        System.out.println("Before " + point.getSignature().getName() + " called!");
    }

    @After("execution(* com.siliconspectra.springaop.service.*.*(..))")
    public void employeeServiceAfter(JoinPoint point) {
        System.out.println("After " + point.getSignature().getName() + " called!");
    }

    @AfterThrowing(value = "execution(* com.siliconspectra.springaop.service.*.*(..))", throwing = "e")
    public void employeeServiceAfterThrow(JoinPoint point, Exception e) {
        System.out.println(point.getSignature().getName() + " throw " + e.getMessage());
    }
}
