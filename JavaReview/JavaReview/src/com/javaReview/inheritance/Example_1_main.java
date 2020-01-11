package com.javaReview.inheritance;

public class Example_1_main {

	public static void main(String[] args) {
		Example_1_player player = new Example_1_player("Namju", 30 , 15);
		Example_1_enemy enemy = new Example_1_enemy("Enemy", 90, 5);

		int count = 0;
	while (player.isAlive() && enemy.isAlive()) {
			
			count++;
			System.out.println(count+" turn");
			player.attack(enemy);
		
			if(!enemy.isAlive()) break;
			enemy.attack(player);
			
			System.out.println("----------------------");
		}
		
		if (player.isAlive()) {
			System.out.println("Player win");
		}
		else System.out.println("Enemy win");
	}

}
