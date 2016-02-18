package com.anna.app;

public class Boing implements Airplane {
	private int passengers = 300;

	public Boing() {
	}

	public Boing(int passengers) {
		this.passengers = passengers;
	}

	public void fly() {
		System.out.println("Boing can fly with " + passengers + " passengers");

	}

}
