package com.eli.study.designpattern.decorator_3;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return 0.99;
	}
}

