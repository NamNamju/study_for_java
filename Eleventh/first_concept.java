package lecture_ten;

public class first_concept {

	public static void main(String[] args) {
		first_concept object = new first_concept();
		object.toStringMethod(object);

	}
	
	public void toStringMethod(Object obj) { // 클래스는 Object 클래스의 상속을 자동으로 받는다.
		System.out.println(obj);
		System.out.println(obj.toString()); // 객체를 처리하기 위한 메소드 중 하나
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		System.out.println("plus "+obj);
		System.out.println("plus "+this); // 위와 같은 결과 (this = 자기 자신을 나타내는 객체)
		
		//toString은 Overriding 할 때 사용된다.
		
	}

}
