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
		 * intern() �޼ҵ带 ����Ͽ� ������ ���ڿ� Ǯ�� ���� �Ҵ��ϵ��� ����� ����Ǵ� ������ �Ѱ谡 �ֱ� ������
		 * �� ������ ���ؼ� ������ �޸𸮸� û���ϴ� �ܰ踦 ��ġ�� �ȴ�.
		 * ����, ���� ���� �ϳ��� ������ �ϱ� ���� �۾��� �ڹ� �ý��� ��ü�� �ǿ����� ��ģ��.
		 * ��, intern() �޼ҵ�� ������� �ʾƾ� �Ѵ�.
		 */
		
		System.out.println(text1 == text2);
		System.out.println(text1 == text3);
		System.out.println(text1.equals(text3));
	}
}
