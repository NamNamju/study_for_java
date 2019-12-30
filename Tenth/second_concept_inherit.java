package lecture_nine;

public class second_concept_inherit extends second_concept_parent{

	public second_concept_inherit() {
		System.out.println("ChildOverriding Constructor");
	}
	
	public void printName() {
		System.out.println("ChildOverriding printName()");
	}
	//Overriding된 메소드는 부모 클래스와 동일한 리턴 타입을 가져야만 한다.
	//Overriding된 메소드의 접근 제어자는 부모 클래스에 있는 메소드와 달라도 되지만, 접근 권환이 확장되는 경우만 허용.
	/* Ex)  부모클래스 - public 자식클래스 - protected (X)
			부모클래스 - proteced 자식클래스 - public (O)
	 */

}
