package lecture_fifteen;

import java.lang.reflect.Method;

public class third_concept_annotaionCheck {

	public static void main(String []args) {
		third_concept_annotaionCheck sample = new third_concept_annotaionCheck();
		sample.checkAnnotations(third_concept_example.class);
	}
	
	public void checkAnnotations(Class useClass) {
		Method[] methods = useClass.getDeclaredMethods();
		// getDeclaredMethods 를 호출하면 해당 클래스(useClass)에 선언되어 있는 메소들의 목록을 배열로 리턴한다.
		
		for(Method tempMethod: methods) {
			third_concept annotation = tempMethod.getAnnotation(third_concept.class);
			// getAnnotaion 을 호출하면 해당 메소드에 선언되어 있는 매개 변수로 넘겨준 어노테이션이 있는지 확인하고, 있을 경우 그 어노테이션의 객체를 리턴해준다.
			
		if(annotation != null) {
			int number = annotation.number();
			String text = annotation.text();
			System.out.println(tempMethod.getName() + "() : number="+number+" text="+text);
		} else {
			System.out.println(tempMethod.getName()+"() : annotation is null.");
		}
		}
	}
	
	// Class, Method라는 것은 자바의 리플레이션이라는 API에서 제공하는 클래스들이다.
	// Class : 클래스의 정보를 확인한다.
	// Method : apthemdml wjdqhfmf ghkrdlsgksek.
}
