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
		 * 위 두개의 catch 블록의 순서를 바꾸면 컴파일 되지 않는다.
		 * 모든 예외의 부모 클래스는 java.lang.Exception 클래스이다.
		 * Exception 클래스는 모든 클래스의 부모 클래스이며 ArrayIndexOutOfBoundsException는 Exception 클래스의 자식 클래스 이기 때문에
		 * Exception 클래스로 처리한 catch 블록 이후에 선언한 블록은 처리될 일이 없다.->컴파일 에러 발생
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
