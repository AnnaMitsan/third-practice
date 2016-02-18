package com.anna.app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Airport {
	@Pointcut("execution(* com.anna.app.Airplane.fly(..))")
	public void startFlight() {
	}

	@Before("startFlight()")
	public void takeSeats() {
		System.out.println("The audience is taking their seats.");
	}

	@Before("startFlight()")
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cellphones");
	}

	@AfterReturning("startFlight()")
	public void smile() {
		System.out.println("CLAP CLAP CLAP CLAP CLAP");
	}

	@AfterThrowing("startFlight()")
	public void dontPanic() {
		System.out.println("Boo! We want our money back!");
	}

	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("Passengers taking their seats.");
			System.out.println("Passengers turning off their cellphones");
			long start = System.currentTimeMillis();

			joinpoint.proceed();

			long end = System.currentTimeMillis();
			System.out.println("CLAP CLAP CLAP CLAP CLAP");
			System.out.println("The flight took " + (end - start) + " milliseconds.");
		} catch (Throwable t) {
			System.out.println("Boo! We want our money back!");
		}
	}
}