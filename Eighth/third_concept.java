package lecture_six;

public class third_concept {

	public static void main(String[] args) {
		third_concept.staticMethod();

	}
	
	public static void staticMethod() {
		System.out.println("This is a staticMethod.");
		//static 메소드는 클래스 변수만 사용할 수 있다.
		/*그렇기 때문에 public static String name; 으로 사용하거나
		  staticMethod에서 static을 빼야 한다.
		 */
	}

}
