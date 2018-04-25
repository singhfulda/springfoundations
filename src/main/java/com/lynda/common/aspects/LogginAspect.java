package com.lynda.common.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect
{
  @Pointcut("@annotation(Loggable)")
  public void executeLogging() {

  }
}
