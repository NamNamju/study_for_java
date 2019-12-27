package lecture_six;

public class first_concept {
	
	//생성자 영역
	public first_concept(){}
	//public first_concept(String arg){} 클래스 이름과 동일하게 이름, 리턴 타입 X
	public String name;
	public first_concept(String name) {
		this.name = name;
	}
	
	public static void main(String[]args)
	{
		first_concept reference = new first_concept("Namju");
		
	}

}
