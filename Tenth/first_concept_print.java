package lecture_nine;

public class first_concept_print {

	public static void main(String []args) {
		first_concept_inherit child = new first_concept_inherit();
		child.printName();
	}
	
	//자식 클래스의 생성자가 호출되면, 자동으로 부모 클래스의 매개 변수 없는 생성자가 실행된다.
}
