package com.anna.app;

public class BadboyPavlo implements Badboy {
	private String thoughts;

	public void thinkOfSomething(String thoughts) {
	this.thoughts = thoughts;
	}

	public String getThoughts(){
	return thoughts;
	}


}
