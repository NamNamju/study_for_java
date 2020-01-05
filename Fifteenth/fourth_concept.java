package lecture_fourteen;

public class fourth_concept {
	// static nested 클래스에서는 감사고 있는 클래스의 static 변수만 참조할 수 있다.
	// 즉, publicInt, protectedInt, justInt, privateInt 라는 변수는 해당 클래스에서 참조가 불가능하다.

	public int publicInt = 0;
	protected int protectedInt = 1;
	int justInt = 2;
	private int privateInt = 3;
	static int staticInt = 4;
	static class StaticNested {
		public void setValue() {
			staticInt = 14;
		}
	}
	
	class Inner {
		public void setValue() {
			publicInt = 20;
			protectedInt = 21;
			justInt = 22;
			privateInt = 23;
			staticInt = 24;
		
		}
	}
	
	public void setValue() {
		third_concept_EventListener listener = new third_concept_EventListener() {
		public void onClick() {
			publicInt = 30;
			protectedInt = 31;
			justInt = 32;
			privateInt = 33;
			staticInt = 34;
		}
	};
	}
}

