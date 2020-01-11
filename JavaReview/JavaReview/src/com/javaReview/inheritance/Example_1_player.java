package com.javaReview.inheritance;

public class Example_1_player extends Example_1_parent{

	public Example_1_player(String name, int hp, int atk) {
		super(name, hp, atk);
		
	}
	
	public void Heal() {
		hp += 20;
		System.out.println("Heal!");
	}
}
