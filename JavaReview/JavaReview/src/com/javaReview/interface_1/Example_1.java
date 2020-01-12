package com.javaReview.interface_1;

public class Example_1 {

	public static void main(String[] args) {
		
		// Example_1_animal animal = new Example_1_animal();
		// Example_1_animal은 abstract class 이므로 객체로 만들 수 없다.
		
		// 추상클래스 부분
		Example_1_dog dog = new Example_1_dog("bbobbi");
		dog.Cry();

		Example_1_cat cat = new Example_1_cat("prada");
		cat.Cry();
		
		Example_1_wolf wolf = new Example_1_wolf("wolf");
		wolf.Cry();
		
		// interface 부분		
		Example_1_pet pet1 = new Example_1_dog("mong");
		Example_1_pet pet2 = new Example_1_cat("gucci");
		
		pet1.needFood();
		pet2.needFood();
		
		// 형변환
		((Example_1_dog)pet1).Cry();
		
	}

}
