package lecture_nine;

public class first_concept_inherit extends first_concept_parent{ // extends 뒤의 클래스를 상속받는다.

	public first_concept_inherit() {
		System.out.println("Child Constructor");
	}
	
	//부모 클래스의 public과 protected로 선언된 모든 변수와 메소드를 자식 클래스가 자유롭게 사용 가능.

}
