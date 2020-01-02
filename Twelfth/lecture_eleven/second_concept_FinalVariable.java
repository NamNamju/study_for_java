package lecture_eleven;

public class second_concept_FinalVariable {

	final int instanceVariable = 1;
	// 인스턴스 변수나 클래스 변수는 생성과 동시에 초기화를 해야 한다.
	
	public void method(final int parameter) {
		final int localVariable;
		// 매개 변수나 지역 변수를 final로 선언하는 경우, 반드시 선언할 때 초기화할 필요는 없다.
		localVariable = 1;
		// 값을 변경하지 못한다.
		
	}
}
