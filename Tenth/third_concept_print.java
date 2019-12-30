package lecture_nine;

public class third_concept_print {

	public static void main(String[] args) {
		third_concept_print print = new third_concept_print();
		print.objectCast();
		print.objectCastArray();

	}
	
	public void objectCast() {
		third_concept_parent parent = new third_concept_parent();
		third_concept_inherit child = new third_concept_inherit();
		
		third_concept_parent parent2 = child; // 상속 관계 성립
		third_concept_inherit child2 = (third_concept_inherit)parent2; // 형변환(참조자료형도 형변환 가능)
		//여기서 parent2가 아닌, parent일 경우 컴파일이 되지 않는다.
		//부모 타입의 객체를 자식 타입으로 형변환 : 명시적으로 타입 지정해야한다. 실제 객체는 자식 타입이어야 한다.
	
	}
	
	public void objectCastArray() {
		third_concept_parent[] parentArray = new third_concept_parent[3];
		parentArray[0] = new third_concept_inherit();
		parentArray[1] = new third_concept_parent();
		parentArray[2] = new third_concept_inherit();
		objectTypeCheck(parentArray);
	}
	
	private void objectTypeCheck(third_concept_parent[] parentArray)
	{
		for(third_concept_parent tempParent:parentArray)
		{
			if(tempParent instanceof third_concept_inherit) { // instanceof -> 타입확인
				System.out.println("ChildCasting");
			} else if(tempParent instanceof third_concept_parent) {
				System.out.println("ParentCasting");
			}
		}
	}

}
