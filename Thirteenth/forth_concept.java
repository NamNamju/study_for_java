package lecture_twelve;

public class forth_concept {

	public static void main(String[] args) {
		forth_concept sample = new forth_concept();
		sample.multiCatch();
		sample.multiCatchWtihNull();

	}
	
	public void multiCatch() {
		int[] intArray = new int[5];
		try {
			System.out.println(intArray[5]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurred. ");
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
		/*
		 * �� �ΰ��� catch ����� ������ �ٲٸ� ������ ���� �ʴ´�.
		 * ��� ������ �θ� Ŭ������ java.lang.Exception Ŭ�����̴�.
		 * Exception Ŭ������ ��� Ŭ������ �θ� Ŭ�����̸� ArrayIndexOutOfBoundsException�� Exception Ŭ������ �ڽ� Ŭ���� �̱� ������
		 * Exception Ŭ������ ó���� catch ��� ���Ŀ� ������ ����� ó���� ���� ����.->������ ���� �߻�
		 */
	}
	
	public void multiCatchWtihNull() {
		int[] intArray = new int[5];
		try {
			intArray = null;
			System.out.println(intArray[5]);
		} catch(NullPointerException e) {
			System.out.println("NullPointerException occured. ");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurred. ");
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
	}

}
