package lecture_six;

public class seventh_concept {

	public static void main(String[] args) {
		seventh_concept varargs = new seventh_concept();
		varargs.calculateNumbersWithArray(new int[] {1,2,3,4,5});
		varargs.calculateNumbers(1,2,3,4,5);

	}
	
	public void calculateNumbersWithArray(int []numbers) {}
	public void calculateNumbers(int...numbers) {
		//�� ���̿� ���� X
		//�ϳ��� �޼ҵ忡�� �� ���� ��� �����ϸ� ���� �Ű� ������ ������ ���� �������� ����.
		
		int total = 0;
		for(int number : numbers) {
			total+=number;
		}
		
		System.out.println("Total ="+total);
	}

}
