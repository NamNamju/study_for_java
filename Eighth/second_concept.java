package lecture_six;

public class second_concept {

	public static void main(String []args) {
		second_concept overload = new second_concept();
		overload.print(20);
		overload.print("Hi");
		overload.print(20,"Hi");
		overload.print("Hi",20);
	}
	
	public void print(int data) {
		
		System.out.println(data);
		
	}
	public void print(String data) {
		
		System.out.println(data);
		
	}
	public void print(int intData, String stringData) {
		
		System.out.println(intData + " " + stringData);
		
	}
	public void print(String stringData, int intData) {
		
		System.out.println(stringData + " " + intData);
		
	}
	//�̸��� ���Ƶ� Ÿ���� ���� �� Ÿ���� �ٸ��� �ٸ� �޼ҵ�� �ν�
	//���� ������ �ϴ� �޼ҵ�� ���� �޼ҵ� �̸��� �������Ѵ�.
}
