package lecture_three;

public class first_concept {

	
	
	public static void main(String args[]) {
		
		first_concept OperatorCompound = new first_concept();
		int intValue = 10;
		
		OperatorCompound.compound(intValue);
		
	}
	
	public void compound(int intValue) {
		
		intValue += 5;
		System.out.println(intValue);
		
		intValue -= 5;
		System.out.println(intValue);
		
		intValue *= 5;
		System.out.println(intValue);
		
		intValue /= 5;
		System.out.println(intValue);
		
		intValue %= 5;
		System.out.println(intValue);
		
	}
}
