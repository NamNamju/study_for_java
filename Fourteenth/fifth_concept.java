package lecture_thirteen;

public class fifth_concept {
	
	public static void main(String args[]) {
		fifth_concept sample = new fifth_concept();
		sample.internCheck();
	}

	public void internCheck() {
		String text1 = "Java Basic";
		String text2 = "Java Basic";
		String text3 = new String("Java Basic");
		
		text3 = text3.intern();
		/*
		 * intern() 메소드를 사용하여 억지로 문자열 풀에 값을 할당하도록 만들면 저장되는 영역은 한계가 있기 때문에
		 * 그 영역에 대해서 별도로 메모리를 청소하는 단계를 거치게 된다.
		 * 따라서, 작은 연산 하나를 빠르게 하기 위한 작업이 자바 시스템 전체에 악영향을 끼친다.
		 * 즉, intern() 메소드는 사용하지 않아야 한다.
		 */
		
		System.out.println(text1 == text2);
		System.out.println(text1 == text3);
		System.out.println(text1.equals(text3));
	}
}
