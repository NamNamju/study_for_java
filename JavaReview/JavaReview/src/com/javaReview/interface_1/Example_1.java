package com.javaReview.interface_1;

public class Example_1 {

	public static void main(String[] args) {
		
		// Example_1_animal animal = new Example_1_animal();
		// Example_1_animal�� abstract class �̹Ƿ� ��ü�� ���� �� ����.
		
		// �߻�Ŭ���� �κ�
		Example_1_dog dog = new Example_1_dog("bbobbi");
		dog.Cry();

		Example_1_cat cat = new Example_1_cat("prada");
		cat.Cry();
		
		Example_1_wolf wolf = new Example_1_wolf("wolf");
		wolf.Cry();
		
		// interface �κ�		
		Example_1_pet pet1 = new Example_1_dog("mong");
		Example_1_pet pet2 = new Example_1_cat("gucci");
		
		pet1.needFood();
		pet2.needFood();
		
		// ����ȯ
		((Example_1_dog)pet1).Cry();
		
	}

}
