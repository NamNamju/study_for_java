package lecture_twelve;

public class second_concept {

	public static void main(String []args) {
		second_concept sample = new second_concept();
		sample.checkVariable();
	}
	
	public void checkVariable() {
		int[] intArray = new int[5];
		try {
			System.out.println(intArray[5]);
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
		
		System.out.println("This code must run. ");
	}
	
	//혹은 아래와 같은 코드 가능.	
	public void checkVariable2() {
		int[] intArray = null;
		try {
			intArray = new int[5];
			// 예외는 intArray[5]가 호출되는 순간 발생하므로, intArray의 크기는 문제 없이 실행된다.
			System.out.println(intArray[5]);
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
		
		System.out.println("This code must run. ");
	}
}
