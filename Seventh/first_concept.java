package lecture_five;

public class first_concept {

	String [] month = {"January", "February", "March", "April", "May", "June", "July",
			"July", "August", "September", "October", "November", "December"};
	
	/*
	 배열 생성하는 법
	 int [] lottoNumbers;
	 lottoNumbers = new int[7];
	 
	 하지만 string은 예외이다.
	 */
	
	public static void main(String [] arg) {
		
		first_concept array = new first_concept();
		System.out.println(array.month[1]);
		
		
	}
}
