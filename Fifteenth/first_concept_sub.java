package lecture_fourteen;

public class first_concept_sub {

	public static void main(String[] args) {
		first_concept_sub sample = new first_concept_sub();
		sample.makeStaticNestedObject();
		}
	
	public void makeStaticNestedObject() {
		first_concept.StaticNested staticNested = new first_concept.StaticNested();
		// StaticNested Ŭ������ ��ü�� �����Ѵ�.
		
		staticNested.setValue(3);
		System.out.println(staticNested.getValue());
	}

}
