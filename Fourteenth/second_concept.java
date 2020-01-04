package lecture_thirteen;

public class second_concept {

	public static void main(String args[]) {
		second_concept sample = new second_concept();
		sample.nullCheck2(null);
		
	}
	
	public boolean nullCheck(String text) {
		int textLength = text.length();
		System.out.println(textLength);
		
		if(text == null) return true;
		else return false;
	}
	
	// nullCheck 메소드를 수행할 경우 NullPointerException이 발생한다.
	
	public boolean nullCheck2(String text) {
		if (text == null) {
			return true;
		} else {
			int textLength = text.length();
			System.out.println(textLength);
			return false;
		}
	}
	// null 체크하는 것은 중요하다. 메소드의 매개 변수로 넘어오는 객체가 널이 될 확률이 조금이라도 있다면 반드시 확인해야 한다.
}
