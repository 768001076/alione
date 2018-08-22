package net.sjl.alione.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description: Controller --AOP
 *
 * @Author:shijialei
 * @Version:1.0
 * @Date:2018/1/11
 */
@Component
@Aspect
public class AopControll {

    @Pointcut("execution(* net.sjl.alione.controller..*.*(..))")
    public void executeService(){

    }

    @Before("executeService()")
    public void beforNotice(){
        System.out.println("我是前置通知!!!");
    }

    @After("executeService()")
    public void afterNotice(){
        System.out.println("我是后置通知!!!");
    }

}
