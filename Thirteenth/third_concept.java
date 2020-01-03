package lecture_twelve;

public class third_concept {

	public static void main(String args[]) {
		third_concept sample = new third_concept();
		sample.finallySample();
		
	}
	
	public void finallySample() {
		int[] intArray = new int[5];
		try {
			System.out.println(intArray[5]);
		} catch (Exception e) {
			
			System.out.println(intArray.length);
		} finally {
			System.out.println("Here is finally");
			// 예외 발생 여부와 상관 없이 실행된다.
		}
		
		System.out.println("This code must run. ");
	}
}
