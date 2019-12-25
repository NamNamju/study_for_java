package lecture_four;

public class first_concept {

	public static void main(String args[]) {
		first_concept control = new first_concept();
		control.elseIf(85);
	}
	
	public void elseIf(int point) {
		if (point > 90) {
			System.out.println("A");
		} else if (point > 80) {
			System.out.println("B");
			
		} else if (point > 80) {
			System.out.println("C");
			
		} else if (point > 80) {
			System.out.println("D");
			
		} else {
			System.out.println("F");
			
		}
	}
}
