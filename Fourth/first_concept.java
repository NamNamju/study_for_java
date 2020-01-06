package lecture_two;

public class first_concept {
	
	int instanceVariable; // 인스턴스 변수 _클래스 변수_메소드 밖,클래스 안
	static int classVariable; // 클래스 변수_인스턴스에 static
	public void method(int parameter) { // 매개 변수 _ 메소드
		int localVariable; // 지역 변수_ 중괄호 내에서만 유효
	}
	
	public void dataType() {
		int a = 10; // primitive data type
		String bookName1 = "God Of Java"; //primitive
		String bookName2 = new String("God of Java"); // reference
	}

}
