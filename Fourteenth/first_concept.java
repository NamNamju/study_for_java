package lecture_thirteen;

public class first_concept {

	public static void main(String [] args) {
		first_concept sample = new first_concept();
		sample.convert();
	}
	
	public void convert() {
		try {
			
			String korean = "�ѱ�"; // "�ѱ�"�̶�� ���� ���� String ��ü�� korean�� ����.
			byte[] array1 = korean.getBytes(); // korean�� byte �迭�� �������.
			
			for(byte data : array1) {
				System.out.print(data + " "); // byte ���� ���.
			}
			
			System.out.println();
			String korean2 = new String(array1);
			System.out.println(korean2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
