package lecture_twelve;

public class sixth_concept {
	
	public static void main(String []args) {
		sixth_concept sample = new sixth_concept();
		sample.throwException(13);
		try {
		sample.throwsException(13);
		// throwsException �޼ҵ带 ȣ���� �޼ҵ忡���� �ݵ�� try-catch������� �޼ҵ带 �����־�� �Ѵ�.
		// Ȥ�� main(String []args) throws Exception ��� �����Ѵ�. ������ �̰��� ���� ����� �ƴ�.
		
		} catch(Exception e) {
			
		}
	}
	
	public void throwException(int number) {
		try {
			if (number > 12) {
				throw new Exception("Number is over than 12");
				//throw��� ����� �� ���� Ŭ������ ��ü�� �����Ѵ�.
				
			}
			
			System.out.println("Number is "+number);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void throwsException(int number) throws Exception {
		/*
		 * �Ű� ���� �Ұ�ȣ �ڿ� throws��� ���� ���� �� �� ���ܸ� �����ϸ�, �ش� �޼ҵ忡�� ������ ���ܰ� �߻����� �� ȣ���� �޼ҵ�� ���ܰ� ���޵ȴ�.
		 * �� ���� �̻��� ���ܸ� ���� �� �ִٸ�, implementsó�� �޸��� �����Ѵ�. Ex) throws NullPointerException, Exception
		 */
		// �̷��� throws�� �޼ҵ� ���� �س����� ���ܰ� �߻����� �� try-catch�� �������� �ʾƵ� �ȴ�.
		
		if (number > 12) {
			throw new Exception("Number is over than 12");
		}
		
		System.out.println("Number is "+number);
	}

}
