package com.javaReview.array_repeat;

import java.util.Random;

public class Example_2 {

	public static void main(String[] args) {
		
		int money = 10000;
		Random random = new Random();
		
		while (money >= 1000) {
			// but lotto
			// lotto_value -> 500
			
			money -= 1000;
			
			int number = random.nextInt(100);
			// 0부터 99까지의 정수값 중 하나를 리턴한다.
			
			System.out.println("번호" + number + "당첨: " + buyLotto(number));
			
			money += buyLotto(number);
			System.out.println("남은 금액" + money);
		}
		
		
	}
	
	static int buyLotto(int number) {
		
		int []lotto = new int[100];
		
		for (int i = 0; i < lotto.length ; i++) {
			lotto[i] = 0;
		}
		
		lotto[1] = 100;
		lotto[22] = 100;
		lotto[39] = 3200;
		lotto[41] = 9000;
		lotto[50] = 1000;
		lotto[62] = 8200;
		lotto[75] = 5500;
		lotto[89] = 7900;
		lotto[90] = 9100;
		
		return lotto[number];
		
	}
}
