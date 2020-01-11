package com.javaReview.classwithgame;

public class Example_1 {

	static class Player {
		
		String name;
		int hp;
		int atk;
		
		// 생성자
		public Player(String name, int hp, int atk) {
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		
		public void attack(Enemy enemy) {
			System.out.println("Player attack!");
			enemy.hp -= this.atk;
			System.out.println("Enemy hp : " + enemy.hp);
			
		}
		
		// 살아있는지 아닌지
		public boolean isAlive() {
			
			if (hp <=0) return false;
			else return true;
		}
		
	}
	
	static class Enemy {
		
		String name;
		int hp;
		int atk;
		
		// 생성자
		public Enemy(String name, int hp, int atk) {
			
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		
		public void attack(Player player) {
			System.out.println("Enemy attack!");
			player.hp -= this.atk;
			System.out.println("Player hp : " +player.hp);
		}
		
		// 살아있는지 아닌지
		public boolean isAlive() {
			
			if (hp <=0) return false;
			else return true;
		}
	}
	public static void main(String[] args) {
		Player player = new Player("Namju", 100, 12);
		Enemy enemy = new Enemy("enemy", 80, 5);
		// player와 enemy의 정보를 기입하여 생성
		
		// player과 enemy가 살아있을 때		
		while (player.isAlive() && enemy.isAlive()) {
			
			player.attack(enemy);
		
			if(!enemy.isAlive()) break;
			enemy.attack(player);
		}
		
		if (player.isAlive()) {
			System.out.println("Player win");
		}
		else System.out.println("Enemy win");

	}

}
