package org.mm.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

//@Aspect
@Component
@Slf4j
public class LoggingAspect2 
{
	@AfterReturning(value  = "execution(* org.mm.service.ShipmentImpl.*(..))", returning = "returnObj")
	public  void afterReturningAspect(JoinPoint joinPoint, Object returnObj)
	{
		log.info("it's AfterRetrurning aspect ... {} ", joinPoint.getSignature());
		log.info("Return from main method " + returnObj);
		System.out.println("Return : " + returnObj);
	}
	
	@AfterThrowing("execution(* org.mm.service.ShipmentImpl.*(..))")
	public void afterThrowingAspect(JoinPoint joinPoint)
	{
		log.info("Afterthrowing Aspect : " + joinPoint);
	}
	
}
