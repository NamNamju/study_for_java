package lecture_fourteen;

public class third_concept_Anonymous {

	public static void main(String []args) {
		third_concept_Anonymous sample = new third_concept_Anonymous();
		sample.setButtonListener();
	}
	
	// 내부 클래스로 third_concept_MagicVuttonListener 클래스를 별도로 만든 것.
	public void setButtonListener() {
		third_concept button = new third_concept();
		third_concept_MagicButtonListener listener = new third_concept_MagicButtonListener();
		button.setListener(listener);
		button.onClickProcess();
	}
	
	// 위와 달리 익명 클래스를 만들 수도 있다.
	public void setButtonListenerAnonymous() {
		third_concept button = new third_concept();
		button.setListener(new third_concept_EventListener() {
			public void onClick() {
				System.out.println("Magic Button Clicked !!!");
			}
		});
		button.onClickProcess();
	}
	
	// 하지만 익명 클래스를 위와 같이 구현했을 때, 클래스 이름도 없고 객체 이름도 없기 때문에 다른 클래스나 메소드에서 참조할 수 없다.
	// 그렇기 때문에 해당 클래스 내에서 재사용하려면 다음과 같이 객체를 생성해야 한다.
	public void setButtonListenerAnonymousObject() {
		third_concept button = new third_concept();
		third_concept_EventListener listener = new third_concept_EventListener() {
		public void onClick() {
			System.out.println("Magic Button Clicked !!!");
		}
	};
	
	button.setListener(listener);
	button.onClickProcess();
	
}
	
}
