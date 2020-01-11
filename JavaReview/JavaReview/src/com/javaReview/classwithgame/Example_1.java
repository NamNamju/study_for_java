package com.javaReview.classwithgame;

public class Example_1 {

	static class Player {
		
		String name;
		int hp;
		int atk;
		
		// ������
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
		
		// ����ִ��� �ƴ���
		public boolean isAlive() {
			
			if (hp <=0) return false;
			else return true;
		}
		
	}
	
	static class Enemy {
		
		String name;
		int hp;
		int atk;
		
		// ������
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
		
		// ����ִ��� �ƴ���
		public boolean isAlive() {
			
			if (hp <=0) return false;
			else return true;
		}
	}
	public static void main(String[] args) {
		Player player = new Player("Namju", 100, 12);
		Enemy enemy = new Enemy("enemy", 80, 5);
		// player�� enemy�� ������ �����Ͽ� ����
		
		// player�� enemy�� ������� ��		
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
