package lecture_twelve;

public class second_concept {

	public static void main(String []args) {
		second_concept sample = new second_concept();
		sample.checkVariable();
	}
	
	public void checkVariable() {
		int[] intArray = new int[5];
		try {
			System.out.println(intArray[5]);
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
		
		System.out.println("This code must run. ");
	}
	
	//Ȥ�� �Ʒ��� ���� �ڵ� ����.	
	public void checkVariable2() {
		int[] intArray = null;
		try {
			intArray = new int[5];
			// ���ܴ� intArray[5]�� ȣ��Ǵ� ���� �߻��ϹǷ�, intArray�� ũ��� ���� ���� ����ȴ�.
			System.out.println(intArray[5]);
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
		
		System.out.println("This code must run. ");
	}
}
