package lecture_fifteen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
// �ش� ������̼� ��� ����� �����Ѵ�.
// ���⼭�� ElementType.METHOD�� �Ұ�ȣ �ȿ� �������ν� �� ������̼��� �޼ҵ忡 ����� �� �ִٰ� ����.

@Retention(RetentionPolicy.RUNTIME)
// �ش� ������̼� ���� ������ �����ϴµ� ����Ѵ�.
// �Ұ�ȣ �ȿ� RetentionPolicy.RUNTIME���� �����ϸ� ����ÿ� �� ������̼��� �����Ѵ�.

public @interface third_concept {
	// @interface�� �����ϸ� @third_concept���� ������̼��� ��� �����ϴ�.
	
	public int number();
	public String text() default "This is first annotaion";
	// ������̼� �ȿ� �޼ҵ�ó�� (number()�� text()) ������ ������ �� ������̼��� ����� �� �ش� �׸� ���� Ÿ������ ���� ���� �����ϴ�.
	// default ������ default �ڿ� �ִ� ���� �� ������̼��� ����� ���� �⺻���� �ȴ�.
	
	}
