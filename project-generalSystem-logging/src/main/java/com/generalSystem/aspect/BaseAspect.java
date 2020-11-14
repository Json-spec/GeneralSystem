package com.generalSystem.aspect;

import org.aspectj.lang.annotation.Pointcut;


public abstract class BaseAspect {

    @Pointcut("@annotation(com.generalSystem.annotation.SystemLoggling)")
    protected void controllerPointcut() {
    }
}
