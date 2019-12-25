package lecture_three;

public class second_concept {

	public static void main(String args[]) {
		second_concept operator = new second_concept();
		operator.casting();
		
	}
	
	public void casting() {
		byte byteValue = 127;
		short shortValue = byteValue;
		
		shortValue++;
		System.out.println(shortValue);
		byteValue = (byte)shortValue;
		System.out.println(byteValue);
		
	}
}
