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
		
		third_concept_parent parent2 = child; // ��� ���� ����
		third_concept_inherit child2 = (third_concept_inherit)parent2; // ����ȯ(�����ڷ����� ����ȯ ����)
		//���⼭ parent2�� �ƴ�, parent�� ��� �������� ���� �ʴ´�.
		//�θ� Ÿ���� ��ü�� �ڽ� Ÿ������ ����ȯ : ��������� Ÿ�� �����ؾ��Ѵ�. ���� ��ü�� �ڽ� Ÿ���̾�� �Ѵ�.
	
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
			if(tempParent instanceof third_concept_inherit) { // instanceof -> Ÿ��Ȯ��
				System.out.println("ChildCasting");
			} else if(tempParent instanceof third_concept_parent) {
				System.out.println("ParentCasting");
			}
		}
	}

}
