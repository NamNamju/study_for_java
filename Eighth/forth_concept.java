package lecture_six;

public class forth_concept {
	
	static String name;
	public forth_concept() {}
	public forth_concept(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		forth_concept reference = new forth_concept();
		reference.checkName();

	}
	public void checkName() {
		forth_concept reference1 = new forth_concept("Namju");
		System.out.println(reference1.name);
		forth_concept reference2 = new forth_concept("Hi");
		System.out.println(reference1.name);
		//static���� name�� �����߱� ������ Ŭ���� �����̹Ƿ� Hi�� ��µȴ�.
		//���ϴ� ���� ���ؼ��� static�� �����ؾ��Ѵ�.
	}

}
