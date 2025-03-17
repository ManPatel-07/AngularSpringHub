package org.mm.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

//@Aspect
@Slf4j
@Component
public class LoggingAspect 
{
//	@Before("execution(* org.mm.service.ShipmentImpl.*(..))")
//	@After("execution(* orderPackage(..))")
	@Before("execution(* org.mm.service.ShipmentImpl.orderPackage(..))")
	public void beforeShipmentServiceMethod(JoinPoint joinPoint)
	{
		log.info("Before Method call : {}", joinPoint.getSignature());
	}
	
//	@After("within(org.mm.service.*)")
//	@Before("within(org.mm..*)")
	@After("servicePointcut()")
	public void allMethodsInsideTheService()
	{
		log.info("With Within aspect call !!");
	}
	
	
	@Pointcut("within(org.mm.service.*)")
	public void servicePointcut()
	{
		
	}
}
