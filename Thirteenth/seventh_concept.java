package lecture_twelve;

public class seventh_concept extends Exception {

	// Exception을 처리하는 예외 클래스
	// 예외 클래스를 임의로 만들 때는 반드시 Throwable의 직계 자손 클래스들을 상속받아 (extends) 만들어야만 한다.
	public seventh_concept() {
		super();
	}
	
	public seventh_concept(String message) {
		super(message);
	}

}
