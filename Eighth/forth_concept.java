package lecture_six;

public class forth_concept {
	
	static String name;
	public forth_concept() {}
	public forth_concept(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		forth_concept reference = new forth_concept();
		reference.checkName();

	}
	public void checkName() {
		forth_concept reference1 = new forth_concept("Namju");
		System.out.println(reference1.name);
		forth_concept reference2 = new forth_concept("Hi");
		System.out.println(reference1.name);
		//static으로 name을 선언했기 때문에 클래스 변수이므로 Hi가 출력된다.
		//원하는 값을 위해서는 static을 제거해야한다.
	}

}
