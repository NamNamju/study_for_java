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
			// ���� ���� �޽����� ���� ���ܸ� �߻���Ŵ.
		}
		double result = d1 / d2;
		System.out.println(result);
	}

}
