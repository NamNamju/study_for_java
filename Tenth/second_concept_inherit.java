package lecture_nine;

public class second_concept_inherit extends second_concept_parent{

	public second_concept_inherit() {
		System.out.println("ChildOverriding Constructor");
	}
	
	public void printName() {
		System.out.println("ChildOverriding printName()");
	}
	//Overriding�� �޼ҵ�� �θ� Ŭ������ ������ ���� Ÿ���� �����߸� �Ѵ�.
	//Overriding�� �޼ҵ��� ���� �����ڴ� �θ� Ŭ������ �ִ� �޼ҵ�� �޶� ������, ���� ��ȯ�� Ȯ��Ǵ� ��츸 ���.
	/* Ex)  �θ�Ŭ���� - public �ڽ�Ŭ���� - protected (X)
			�θ�Ŭ���� - proteced �ڽ�Ŭ���� - public (O)
	 */

}
