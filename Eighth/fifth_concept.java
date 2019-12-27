package lecture_six;

public class fifth_concept {

	static int data = 1;
	public fifth_concept() {
		System.out.println("StaticBlock Constructor.");
	}
	
	static {
		System.out.println("*** First static block. ***");
		data = 3;
	}
	
	static {
		System.out.println("*** Second static block. ***");
		data = 5;
	}
	//static ����� �� ������ ȣ��Ǹ� ����Ǿ� �ִ� ������� ȣ��ȴ�.
	
	public static int getData() {
		return data;
	}
	public static void main(String[] args) {
		System.out.println(fifth_concept.getData());

	}

}
