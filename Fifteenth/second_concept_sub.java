package lecture_fourteen;

public class second_concept_sub {

	public static void main(String[] args) {
		second_concept_sub sample = new second_concept_sub();
		sample.makeInnerObject();

	}
	
	public void makeInnerObject() {
		second_concept outer = new second_concept();
		second_concept.Inner inner = outer.new Inner();
		/*
		 * Inner Ŭ������ ��ü�� �����ϱ� ��, ���� Inner Ŭ������ ���δ� second_concept Ŭ������ ��ü�� �����.
		 * �� outer ��ü�� ���� Inner Ŭ������ ��ü�� �����.
		 */
		
		inner.setValue(3);
		System.out.println(inner.getValue());
	}
	/*
	 * ���� Ŭ������ ����� ���� = ĸ��ȭ
	 * �ϳ��� Ŭ�������� � �������� �۾��� �����ϴ� Ŭ������ �ʿ��ѵ� �ٸ� Ŭ���������� �� Ŭ������ �ʿ� ���� �� ���� Ŭ������ �����.
	 * ���� GUI ���� ���α׷��� ������ �� ����Ѵ�.
	 */

}
