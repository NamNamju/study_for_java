package com.javaReview.assume;

public class Example_1 {

	public static void main(String[] args) {
		
		boolean isCar = false;
		boolean haveHome = false;
		boolean isJob = false;
		boolean isGoldSpoon = false;
		
		int cost = 17000;
		
		int myScore = canMarry(isCar, haveHome, isJob, isGoldSpoon, cost);
		System.out.println(myScore);

	}
	
	static int canMarry(boolean isCar, boolean haveHome, boolean isJob, boolean isGoldSpoon, int cost) {
		
		
		if (isGoldSpoon) {
			return 1;
		}
		
		else if (haveHome) {
			return 2;
		}
		
		else if (isCar){
			return 3;
			
		}
		else if (isJob) {
			return 4;
		}
		
		else {
			
			if (cost > 30000) return 5;
			
			else {
				return 6;
			}
			
		}
		
		
	}

}
