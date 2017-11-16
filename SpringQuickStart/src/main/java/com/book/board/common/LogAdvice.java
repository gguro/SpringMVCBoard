package com.book.board.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	
	@Pointcut("execution(* com.book.board..*Impl.*(..))")
	public void allPointcut() {}
	
	
	@Pointcut("execution(* com.book.board..*Impl.get*(..))")
	public void getPointcut() {}
	
	@Before("allPointcut()")
	public void printLog() {
		System.out.println(">> test log");
	}
	
	
	
	
}
