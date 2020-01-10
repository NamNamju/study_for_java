package com.javaReview.array_repeat;

public class Example_1 {

	public static void main(String[] args) 
	{
		
		String names[] = new String[11];
		names[0] = "Hwang";
		names[1] = "Namju";
		
		// 1
		
		for (int i = 0; i < names.length ; i++) {
			System.out.println(names[i]);
		}
		
		// 2
		
		int i = 0;
		
		while (i<names.length) {
			System.out.println(names[i]);
			i++;
		}
		
		
	}
}
