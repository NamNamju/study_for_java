package lecture_eleven_sub;

import lecture_eleven.first_concept;
import lecture_eleven.first_concept_Impl;

public class first_concept_InterfaceExample {
	
	public static void main(String args[]) {
		first_concept member = new first_concept_Impl();
		
		/* first_concept_Impl 클래스는 인터페이스에 선언되어 있는 모든 메소드가 구현되어 있음
		 * 따라서 실제 member 타입은 first_concept가 되고,
		 * member에 선언된 메소드들을 실행하면 first_concept_Impl에 있는 메소드 실행.
		 */
	}
}
