package com.javaReview.inheritance;

public class Example_1_enemy extends Example_1_parent{

	public Example_1_enemy(String name, int hp, int atk) {
		super(name, hp, atk);
		
	}
	
	@Override
	public void attack(Example_1_parent enemy) {
		
		if (hp <= 20)
		{
			System.out.println("Enemy is angry!!");
			this.atk += 15;
		}
		super.attack(enemy);
		
		Example_1_player player = (Example_1_player)enemy;
		// Çüº¯È¯
		
		if (player.hp <= 30) {
			
			player.Heal();	
		}
	}


}
