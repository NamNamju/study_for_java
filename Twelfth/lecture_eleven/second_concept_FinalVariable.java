package lecture_eleven;

public class second_concept_FinalVariable {

	final int instanceVariable = 1;
	// �ν��Ͻ� ������ Ŭ���� ������ ������ ���ÿ� �ʱ�ȭ�� �ؾ� �Ѵ�.
	
	public void method(final int parameter) {
		final int localVariable;
		// �Ű� ������ ���� ������ final�� �����ϴ� ���, �ݵ�� ������ �� �ʱ�ȭ�� �ʿ�� ����.
		localVariable = 1;
		// ���� �������� ���Ѵ�.
		
	}
}
