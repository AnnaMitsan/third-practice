package com.anna.app;

import org.aspectj.lang.annotation.*;

public class AdministratorLena implements Administration {
	private String thoughts;

	@Pointcut("execution(* com.anna.app.Badboy.thinkOfSomething(String)) and args(thoughts)")
	public void thinking(String thoughts){}
	
	@Before("thinking(thoughts)")
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteers's thoughts");
		this.thoughts = thoughts;
	}
	public String getThoughts() {
		return thoughts;
	}

}
