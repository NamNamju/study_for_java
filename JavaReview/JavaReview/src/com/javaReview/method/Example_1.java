package com.javaReview.method;

public class Example_1 {

	public static void main(String []args) {
		
		int plusResult = plus(1, 2);
		System.out.println(plusResult);
		
		printTwice("printTwice");
	}
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static void printTwice(String str) {
		
		System.out.println(str);
		System.out.println(str);
	}
}
