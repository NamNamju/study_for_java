package lecture_twelve;

public class Example_one {

	public static void main(String[] args) {
		Example_one calc = new Example_one();
		
		try {
			calc.printDivide(1,2);
			calc.printDivide(1,0);
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public void printDivide(double d1, double d2) throws Exception{
		
		if (d2 == 0) {
			throw new Exception("Second value can't be Zero.");
			// 위와 같은 메시지를 갖는 예외를 발생시킴.
		}
		double result = d1 / d2;
		System.out.println(result);
	}

}
