package lecture_fourteen;

public class second_concept {

	class Inner {
		// static nested 클래스와 내부 클래스의 차이는 겉보기에는 static을 쓰냐 안쓰냐의 차이이다.
		
		private int value = 0;
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
	}
}
