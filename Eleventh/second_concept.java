package lecture_ten;

public class second_concept {

	public static void main(String args[]) {
		second_concept thisObject = new second_concept();
		thisObject.equalMethod();
		
	}
	
	public void equalMethod() {
		
		second_concept_DTO obj1 = new second_concept_DTO("Sangmin");
		second_concept_DTO obj2 = new second_concept_DTO("Sangmin");
		/*if(obj1 == obj2) {
			System.out.println("obj1 and obj2 is same");
		} else {
			System.out.println("obj1 and obj2 is different");
		} */
		
		// ���� ���� �ڵ��� ������� different�� ���´�. �ּҰ��� �ٸ��� �����̴�.
		
		 if(obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 is same");
		}
		else {
			System.out.println("obj1 and obj2 is different");
		}
		/* equals �޼ҵ带 overriding ���� ���� ��� ���� ���� �ڵ��� ����� ���� different�� �ȴ�.
		 * ������ equals �޼ҵ带 overriding ���־��� ������ same�� �ȴ�.
		 * �׷��� ���� ��� �� �޼ҵ忡���� hashCode() ��, �� �ּҰ� �񱳰� �ȴ�.
		 */
		
		
	}
	
}
