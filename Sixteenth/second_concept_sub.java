package lecture_fifteen;

public class second_concept_sub {

	@SuppressWarnings("deprecation")
	// 일부러 이렇게 코딩했으니 경고할 필요 없다는 것을 알려주는 어노테이션
	public void useDeprecated() {
		second_concept child = new second_concept();
		// child.noMoreUse();
		// Deprecated를 표시하는 이유는, 지워버린 메소드나 클래스를 참조하는 다른 개발자가 프로그램의 변경 사항을 보를 수 있기 때문이다.
		// 그래서 무작정 지워버리지 않는 것.
	}
}
