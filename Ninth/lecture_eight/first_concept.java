package lecture_eight;

public class first_concept {

	public void publicMethod() {
		// 누구나 접근 가능
	}
	
	protected void protectedMethod() {
		// 같은 패키지 내에 있거나 상속받은 경우 접근가능
	}
	
	void packagePrivateMethod() {
		// 같은 패키지 내에 있을 때만 가능
	}
	
	private void privateMethod() {
		// 해당 클래스 내에서만 접근
	}
}

class first_concept_two {
	
	// 이 클래스 앞에는 public을 붙일 수 없다. public으로 선언된 클래스가 소스 내에 있다면, 그 소스 파일의 이름은 public인 클래스 이름과 동일해야한다.
}
