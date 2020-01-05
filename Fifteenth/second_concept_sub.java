package lecture_fourteen;

public class second_concept_sub {

	public static void main(String[] args) {
		second_concept_sub sample = new second_concept_sub();
		sample.makeInnerObject();

	}
	
	public void makeInnerObject() {
		second_concept outer = new second_concept();
		second_concept.Inner inner = outer.new Inner();
		/*
		 * Inner 클래스의 객체를 생성하기 전, 먼저 Inner 클래스를 감싸는 second_concept 클래스의 객체를 만든다.
		 * 이 outer 객체를 통해 Inner 클래스의 객체를 만든다.
		 */
		
		inner.setValue(3);
		System.out.println(inner.getValue());
	}
	/*
	 * 내부 클래스를 만드는 이유 = 캡슐화
	 * 하나의 클래스에서 어떤 공통적인 작업을 수행하는 클래스가 필요한데 다른 클래스에서는 그 클래스가 필요 없을 때 내부 클래스를 만든다.
	 * 보통 GUI 관련 프로그램을 개발할 때 사용한다.
	 */

}
