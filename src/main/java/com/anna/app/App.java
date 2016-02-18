package com.anna.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Airplane airplane = (Airplane) context.getBean("boing");
		airplane.fly();		
		Badboy pavlo = (Badboy) context.getBean("pavlo");
		Administration lena = (Administration) context.getBean("lena");
		pavlo.thinkOfSomething("thinkinggggg");
		System.out.println(lena.getThoughts());		
		Contestant contestant = (Contestant) context.getBean("boing");
		contestant.receiveAward();
	}
}