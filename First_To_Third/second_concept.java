package lecture_one_one;

public class second_concept {

	public static void main(String [] args) {
		System.out.println("Calculator class is started");
		second_concept calc = new second_concept(); // new
		int a = 20;
		int b = 10;
		System.out.println("add = " +calc.add(a,b));
		System.out.println("add = " +calc.subtract(a,b));
		System.out.println("add = " +calc.multiply(a,b));
		System.out.println("add = " +calc.divide(a,b));
		
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return a/b;
	}
	//method
	
}
