package com.javaReview.interface_1;

public class Example_1_cat extends Example_1_animal implements Example_1_pet{

	public Example_1_cat(String name) {
		super(name);
	}

	@Override
	public void Cry() {
		System.out.println("³Ä¿Ë");
		
	}
	
	@Override
	public void needFood() {
		System.out.println("Food !!!");
	}

}
