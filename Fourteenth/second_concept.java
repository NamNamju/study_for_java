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
	
	// nullCheck �޼ҵ带 ������ ��� NullPointerException�� �߻��Ѵ�.
	
	public boolean nullCheck2(String text) {
		if (text == null) {
			return true;
		} else {
			int textLength = text.length();
			System.out.println(textLength);
			return false;
		}
	}
	// null üũ�ϴ� ���� �߿��ϴ�. �޼ҵ��� �Ű� ������ �Ѿ���� ��ü�� ���� �� Ȯ���� �����̶� �ִٸ� �ݵ�� Ȯ���ؾ� �Ѵ�.
}
