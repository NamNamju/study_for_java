package lecture_fourteen;

public class first_concept {

	static class StaticNested {
		// 사용 이유 : 한 곳에서만 사용되는 클래스를 논리적으로 묶어서 처리할 때.
		
		private int value = 0;
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
	}
	

}
