package lecture_eleven;

public enum third_concept_enumValue2 {

	//enum 상수 값을 지정한다.
	THREE_HOUR(18000),
	FIVE_HOUR(30000),
	WEEKEND_FOUR_HOUR(40000),
	WEEKEND_EIGHT_HOUR(60000);
	
	// 생성자에서 매개 변수로 넘겨받은 값을 할당할 때 사용한다.
	private final int amount;
	
	//enum 클래스의 생성자는 아무것도 명시하지 않은 package-private과 private만 사용 가능하다.
	third_concept_enumValue2(int amount) {
		this.amount = amount;
	}
	
	//enum 클래스의 변수로 선언한 amount 값을 리턴한다.
	public int getAmount() {
		return amount;
	}
}
