package org.mm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class ValidationAspect 
{
	@Around("execution(* org.mm.service.ShipmentImpl.*(..))")
	public Object validationAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
	{
		Object[] args = proceedingJoinPoint.getArgs();
		
		Long orderId = (Long)args[0];
		
		if(orderId > 0)
		{
			System.out.println(proceedingJoinPoint.proceed());
			return proceedingJoinPoint.proceed();
		}
		return "Cannot call with the negetive value ...";
	}
	
	
	@Around("execution(* org.mm.service.ShipmentImpl.*(..))")
	public Object executionTimeAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
	{
		long startTime = System.currentTimeMillis();
		
		proceedingJoinPoint.proceed();
		
		long endTime = System.currentTimeMillis();
		
		return "Total time of execution : " + (endTime-startTime);
	}
}
