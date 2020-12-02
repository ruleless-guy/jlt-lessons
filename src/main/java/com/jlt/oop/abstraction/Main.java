package com.jlt.oop.abstraction;

public class Main {

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape triagle = new Triagle();
		Shape rectangle = new Rectangle();
		
		circle.showShape();
		triagle.showShape();
		rectangle.showShape();
	}
	
}
