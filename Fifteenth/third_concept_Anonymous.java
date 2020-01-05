package lecture_fourteen;

public class third_concept_Anonymous {

	public static void main(String []args) {
		third_concept_Anonymous sample = new third_concept_Anonymous();
		sample.setButtonListener();
	}
	
	// ���� Ŭ������ third_concept_MagicVuttonListener Ŭ������ ������ ���� ��.
	public void setButtonListener() {
		third_concept button = new third_concept();
		third_concept_MagicButtonListener listener = new third_concept_MagicButtonListener();
		button.setListener(listener);
		button.onClickProcess();
	}
	
	// ���� �޸� �͸� Ŭ������ ���� ���� �ִ�.
	public void setButtonListenerAnonymous() {
		third_concept button = new third_concept();
		button.setListener(new third_concept_EventListener() {
			public void onClick() {
				System.out.println("Magic Button Clicked !!!");
			}
		});
		button.onClickProcess();
	}
	
	// ������ �͸� Ŭ������ ���� ���� �������� ��, Ŭ���� �̸��� ���� ��ü �̸��� ���� ������ �ٸ� Ŭ������ �޼ҵ忡�� ������ �� ����.
	// �׷��� ������ �ش� Ŭ���� ������ �����Ϸ��� ������ ���� ��ü�� �����ؾ� �Ѵ�.
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
