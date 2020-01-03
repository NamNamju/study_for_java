package lecture_twelve;

public class first_concept {
	
	public static void main(String[] args) {
		first_concept sample = new first_concept();
		sample.arrayOutOfBoundsTryCatch();
	}
	
	/*public void arrayOutOfBounds() {
		int[] intArray = new int[5];
		System.out.println(intArray[5]);
		// 배열 범위 밖의 값을 읽으려고 할 때
	}*/
	
	//예외 처리
	
	public void arrayOutOfBoundsTryCatch() {
		
		//try 뒤에 중괄호로 예외가 발생하는 문장들을 붂어 주고, catch 괄호 안에 예외가 발생했을 때 처리를 해준다.
		try {
			int[] intArray = new int[5];
			System.out.println(intArray[5]);
		} catch (Exception e) {
			System.out.println("Exception occured. ");
			
		}
		
		System.out.println("This code must run. ");
	}

}
