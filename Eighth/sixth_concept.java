package lecture_six;

public class sixth_concept {
	
	public String name;
	public sixth_concept(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		sixth_concept reference = new sixth_concept("Namju");
		reference.callPassByValue();
		reference.callPassByReference();

	}
	public void callPassByValue() {
		int a = 10;
		String b = "b";
		System.out.println("before passByValue");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		passByValue(a,b);
		System.out.println("after passByValue");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}
	
	public void passByValue(int a, String b) {
		a = 20;
		b = "z";
		System.out.println("in passByValue");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}
	//pass by value는 단지 값을 전달하는 작업. 즉, 호출 되기 전과 후의 값이 다르지 않음.
	
	public void callPassByReference() {
		sixth_concept member = new sixth_concept("Namju");
		System.out.println("before passByReference");
		System.out.println("member.name="+member.name);
		passByReference(member);
		System.out.println("after passByReference");
		System.out.println("member.name="+member.name);
	}
	
	public void passByReference(sixth_concept member) {
		member.name = "Hi";
		System.out.println("in passByReference");
		System.out.println("member.name="+member.name);
	}
	
	//pass by reference는 값이 아닌 참조가 전달된다.

}
