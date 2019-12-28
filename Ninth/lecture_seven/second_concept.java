package lecture_seven;

// import lecture_seven_sub.second_concept_sub;
import static lecture_seven_sub.second_concept_sub.subStaticMethod;
import static lecture_seven_sub.second_concept_sub.CLASS_NAME;
//모두 선언할 필요 없이 *만 사용해도 된다.

public class second_concept {

	public static void main(String[] args) {
		//second_concept_sub.subStaticMethod();
		//System.out.println(second_concept_sub.CLASS_NAME;
		subStaticMethod();
		System.out.println(CLASS_NAME);

	}
	
	/*static 메소드나 변수가 중복되는 경우 자신의 클래스에 있는 static 변수나 메소드가
	  import static으로 가져온 것보다 우선이 된다.*/

}
