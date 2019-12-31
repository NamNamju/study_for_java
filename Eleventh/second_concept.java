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
		
		// 위와 같은 코드의 결과값은 different로 나온다. 주소값이 다르기 때문이다.
		
		 if(obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 is same");
		}
		else {
			System.out.println("obj1 and obj2 is different");
		}
		/* equals 메소드를 overriding 하지 않을 경우 위와 같은 코드의 결과값 또한 different가 된다.
		 * 하지만 equals 메소드를 overriding 해주었기 때문에 same이 된다.
		 * 그렇지 않을 경우 이 메소드에서는 hashCode() 값, 즉 주소값 비교가 된다.
		 */
		
		
	}
	
}
