package lecture_twelve;

public class first_concept {
	
	public static void main(String[] args) {
		first_concept sample = new first_concept();
		sample.arrayOutOfBoundsTryCatch();
	}
	
	/*public void arrayOutOfBounds() {
		int[] intArray = new int[5];
		System.out.println(intArray[5]);
		// �迭 ���� ���� ���� �������� �� ��
	}*/
	
	//���� ó��
	
	public void arrayOutOfBoundsTryCatch() {
		
		//try �ڿ� �߰�ȣ�� ���ܰ� �߻��ϴ� ������� ���� �ְ�, catch ��ȣ �ȿ� ���ܰ� �߻����� �� ó���� ���ش�.
		try {
			int[] intArray = new int[5];
			System.out.println(intArray[5]);
		} catch (Exception e) {
			System.out.println("Exception occured. ");
			
		}
		
		System.out.println("This code must run. ");
	}

}
