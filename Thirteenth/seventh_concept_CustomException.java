package lecture_twelve;

public class seventh_concept_CustomException {

	// Exception ��� seven_concept(���� ���� Ŭ����)�� ����Ѵ�.
	
	public static void main(String[] args) {
		seventh_concept_CustomException sample = new seventh_concept_CustomException();
		
		try {
			sample.throwMyException(13);
		} catch(seventh_concept mye) {
			mye.printStackTrace();
		}

	}
	
	public void throwMyException(int number) throws seventh_concept{
		try {
			if (number > 12) {
				throw new seventh_concept("Number is over than 12");
			}
			
		} catch (seventh_concept e) {
			e.printStackTrace();
		}
	}

}
