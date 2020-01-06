package lecture_fifteen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
// 해당 어노테이션 사용 대상을 지정한다.
// 여기서는 ElementType.METHOD를 소괄호 안에 넣음으로써 이 어노테이션은 메소드에 사용할 수 있다고 지정.

@Retention(RetentionPolicy.RUNTIME)
// 해당 어노테이션 유지 정보를 지정하는데 사용한다.
// 소괄호 안에 RetentionPolicy.RUNTIME으로 지정하면 실행시에 이 어노테이션을 참조한다.

public @interface third_concept {
	// @interface로 선언하면 @third_concept으로 어노테이션이 사용 가능하다.
	
	public int number();
	public String text() default "This is first annotaion";
	// 어노테이션 안에 메소드처럼 (number()과 text()) 선언해 놓으면 이 어노테이션을 사용할 때 해당 항목에 대한 타입으로 값을 지정 가능하다.
	// default 예약어는 default 뒤에 있는 값이 이 어노테이션을 사용할 때의 기본값이 된다.
	
	}
