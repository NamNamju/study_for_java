package lecture_fifteen;

import java.lang.reflect.Method;

public class third_concept_annotaionCheck {

	public static void main(String []args) {
		third_concept_annotaionCheck sample = new third_concept_annotaionCheck();
		sample.checkAnnotations(third_concept_example.class);
	}
	
	public void checkAnnotations(Class useClass) {
		Method[] methods = useClass.getDeclaredMethods();
		// getDeclaredMethods �� ȣ���ϸ� �ش� Ŭ����(useClass)�� ����Ǿ� �ִ� �޼ҵ��� ����� �迭�� �����Ѵ�.
		
		for(Method tempMethod: methods) {
			third_concept annotation = tempMethod.getAnnotation(third_concept.class);
			// getAnnotaion �� ȣ���ϸ� �ش� �޼ҵ忡 ����Ǿ� �ִ� �Ű� ������ �Ѱ��� ������̼��� �ִ��� Ȯ���ϰ�, ���� ��� �� ������̼��� ��ü�� �������ش�.
			
		if(annotation != null) {
			int number = annotation.number();
			String text = annotation.text();
			System.out.println(tempMethod.getName() + "() : number="+number+" text="+text);
		} else {
			System.out.println(tempMethod.getName()+"() : annotation is null.");
		}
		}
	}
	
	// Class, Method��� ���� �ڹ��� ���÷��̼��̶�� API���� �����ϴ� Ŭ�������̴�.
	// Class : Ŭ������ ������ Ȯ���Ѵ�.
	// Method : apthemdml wjdqhfmf ghkrdlsgksek.
}
