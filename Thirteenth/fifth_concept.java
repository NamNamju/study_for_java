package lecture_twelve;

public class fifth_concept {

	public static void main(String[] args) {
		fifth_concept sample = new fifth_concept();
		sample.throwable();

	}
	
	public void throwable() {
		int[] intArray = new int[5];
		try {
			intArray = null;
			System.out.println(intArray[5]);
		} catch(Throwable t) {
			System.out.println(t.getMessage());
			System.out.println(t.toString());
			t.printStackTrace();
			//위의 세가지 메소드를 이용하면 예외 메세지를 출력할 수 있다.
		}
	}

}
