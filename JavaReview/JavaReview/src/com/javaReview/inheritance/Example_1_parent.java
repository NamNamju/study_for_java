package com.javaReview.inheritance;

public class Example_1_parent {

	String name;
	int hp;
	int atk;
	
	public Example_1_parent(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}

	public void attack(Example_1_parent enemy) {
		
		System.out.println(this.name + " attack!");
		enemy.hp -= this.atk;
		System.out.println(enemy.name + " hp : " + enemy.hp);
	}
	
	public boolean isAlive() {
		
		if (hp <=0) return false;
		else return true;
	}
	

}
