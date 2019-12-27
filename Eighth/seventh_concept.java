package lecture_six;

public class seventh_concept {

	public static void main(String[] args) {
		seventh_concept varargs = new seventh_concept();
		varargs.calculateNumbersWithArray(new int[] {1,2,3,4,5});
		varargs.calculateNumbers(1,2,3,4,5);

	}
	
	public void calculateNumbersWithArray(int []numbers) {}
	public void calculateNumbers(int...numbers) {
		//점 사이에 공백 X
		//하나의 메소드에서 한 번만 사용 가능하며 여러 매개 변수가 있으면 가장 마지막에 선언.
		
		int total = 0;
		for(int number : numbers) {
			total+=number;
		}
		
		System.out.println("Total ="+total);
	}

}
