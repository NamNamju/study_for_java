package lecture_thirteen;

public class third_concept {

	public static void main(String[] args) {
		third_concept sample = new third_concept();
		sample.checkString();
		sample.CheckCompare();

	}
	
	public void checkString() {
		String text = "You must know String calss.";
		System.out.println("text.length() = " + text.length());
		System.out.println("tet.isEmpty() = " + text.isEmpty());
	}
	
	public void CheckCompare() {
		String text = "Check value";
		// String text2 = "Check value";
		/*
		 * String�� ��� ������ ���� ���� ��ü�� ������, �̹� ���� ��ü�� �����Ѵ�.
		 * ��, text�� text2 ��ü�� �����δ� ���� ��ü�̴�.
		 */
		String text2 = new String("Check value");
		// �̰��� �������� �ʰ� ������ ��ü�� �����Ѵ�.
		
		if (text == text2) {
			System.out.println("text==text2 result is same. ");
		} else {
			System.out.println("text==text2 result is different. ");
		}
		// �ڹٿ��� ��ü�� �׻� equals() �޼ҵ�� �񱳸� �ؾ��Ѵ�.
		
		if(text.equals("Check value")) {
			System.out.println("text.equals(text2) result is same. ");
		}
		// ������ �̰��� ��ҹ��ڸ� ���������� �ʴ´�.
	}

}
