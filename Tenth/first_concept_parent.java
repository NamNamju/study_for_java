package lecture_nine;

public class first_concept_parent {

	//상속을 위해서 부모 클래스에서 할 일은 기본 생성자를 만드는 것 뿐이다!
	//만약 기본 생성자를 만들지 않고 매개변수가 있는 생성자를 만든다면, super예약어를 사용한다. (자식 클래스의 생성자에서 가장 첫줄)
	/*Ex) String 타입의 매개변수라면, 자식 클래스에 super("String")과 같이 사용*/
	
	public first_concept_parent() {
		System.out.println("Parent Constructor");
	}
	
	public void printName() {
		System.out.println("Parent printName()");
	}
}
