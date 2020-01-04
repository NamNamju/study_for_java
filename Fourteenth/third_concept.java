package lecture_thirteen;

public class third_concept {

	public static void main(String[] args) {
		third_concept sample = new third_concept();
		sample.checkString();
		sample.CheckCompare();

	}
	
	public void checkString() {
		String text = "You must know String calss.";
		System.out.println("text.length() = " + text.length());
		System.out.println("tet.isEmpty() = " + text.isEmpty());
	}
	
	public void CheckCompare() {
		String text = "Check value";
		// String text2 = "Check value";
		/*
		 * String의 경우 동일한 값을 갖는 객체가 있으면, 이미 만든 객체를 재사용한다.
		 * 즉, text와 text2 객체는 실제로는 같은 객체이다.
		 */
		String text2 = new String("Check value");
		// 이것은 재사용하지 않고 별도의 객체를 생성한다.
		
		if (text == text2) {
			System.out.println("text==text2 result is same. ");
		} else {
			System.out.println("text==text2 result is different. ");
		}
		// 자바에서 객체는 항상 equals() 메소드로 비교를 해야한다.
		
		if(text.equals("Check value")) {
			System.out.println("text.equals(text2) result is same. ");
		}
		// 하지만 이것은 대소문자를 구분하지는 않는다.
	}

}
