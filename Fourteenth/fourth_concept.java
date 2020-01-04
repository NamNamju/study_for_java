package lecture_thirteen;

public class fourth_concept {

	public static void main(String[] args) {
		fourth_concept sample = new fourth_concept();
		String addresses[] = new String[] {
				"����� ���α� �ŵ�����",
				"��⵵ ������ �д籸 ���ڵ�",
				"����� ���α� ������",
		};
		sample.checkAddress(addresses);
		sample.checkMatch();
		sample.checkIndexOf();
		sample.subString();
		sample.checkSplit();
	}
	
	public void checkAddress(String[] addresses) {
		int startCount = 0, endCount = 0, containCount = 0;
		String startText = "�����";
		String endText = "��";
		String containText = "���α�";
		for(String address : addresses) {
			if(address.startsWith(startText)) {
				// startText�� �����ϴ� ���ڿ��� ã�� �� �ִ�.
				startCount++;
			}
			
			if(address.endsWith(endText)) {
				// endText�� ������ ���ڿ��� ã�� �� �ִ�.
				endCount++;
			}
			
			if(address.contains(containText)) {
				// containText�� �����ϴ� ���ڿ��� ã�� �� �ִ�.
				containCount++;
			}
		}
		
		System.out.println("Starts with "+startText+" count is "+startCount);
		System.out.println("Ends with "+endText+" count is "+endCount);
		System.out.println("Contains "+containText+" count is "+containCount);
	}
	
	public void checkMatch() {
		String text = "This is a text";
		String compare1 = "is";
		String compare2 = "this";
		System.out.println(text.regionMatches(2, compare1, 0, 1));
		System.out.println(text.regionMatches(5, compare1, 0, 2));
		// (�� ��� ���ڿ��� Ȯ�� ���� ��ġ�� ����, Ȯ���� ���ڿ�, ���� ��ġ, ����)
		
		System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
		// ���� �Ű������� true�� ignoreCase��, true�� ��� ��ҹ��� ���� ���� �ʰ�, ���� �� �Ѵ�.
	}
	
	public void checkIndexOf() {
		String text = "Java technology is both a programming language and a platform. ";
		System.out.println(text.indexOf('a'));
		System.out.println(text.indexOf("a "));
		System.out.println(text.indexOf('a', 20));
		System.out.println(text.indexOf("a ",20));
		// ���� �� �ڵ�� 20��° �ڸ����� ã�� �۾��� �����Ѵ�.
		
		System.out.println(text.indexOf('z'));
		// z�� ���忡 �����Ƿ� -1�� ����Ѵ�.
		// lastIndexOf()��� �޼ҵ带 ����� ��� �ڿ������� �˻��� �����Ѵ�.
	}
	
	public void subString() {
		char values[] = new char[] {'J', 'a', 'v', 'a'};
		String javaText = String.copyValueOf(values);
		// char �迭�� ���� String���� ��ȯ�ϴ� �޼ҵ�
		
		String text = "Java technology";
		String technology = text.substring(5);
		// �ش� ��°���� text ���ڿ��� ���� �������� ��� �߶󳻶�� �ǹ�.
		
		String tech = text.substring(5, 9);
		// �ش� ��°���� ������ ��ġ���� �߶󳻶�� �ǹ�.
		
		System.out.println(technology);
		System.out.println(tech);
		
	}
	
	public void checkSplit() {
		String text = "Java technology is both a programming language and a platform. ";
		String[] splitArray = text.split(" ");
		// ���ڿ��� �߶� String�� �迭�� �����Ѵ�.
		
		for(String temp : splitArray) {
			System.out.println(temp);
		}
	}

}
