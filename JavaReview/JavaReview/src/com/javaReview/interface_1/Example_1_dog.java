package com.javaReview.interface_1;

public class Example_1_dog extends Example_1_animal implements Example_1_pet{

	public Example_1_dog(String name) {
		super(name);
	}

	@Override
	public void Cry() {
		System.out.println("¸Û¸Û!");
	}
	
	@Override
	public void needFood() {
		System.out.println("Give me some food!");
	}

}
