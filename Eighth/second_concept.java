package lecture_six;

public class second_concept {

	public static void main(String []args) {
		second_concept overload = new second_concept();
		overload.print(20);
		overload.print("Hi");
		overload.print(20,"Hi");
		overload.print("Hi",20);
	}
	
	public void print(int data) {
		
		System.out.println(data);
		
	}
	public void print(String data) {
		
		System.out.println(data);
		
	}
	public void print(int intData, String stringData) {
		
		System.out.println(intData + " " + stringData);
		
	}
	public void print(String stringData, int intData) {
		
		System.out.println(stringData + " " + intData);
		
	}
	//이름이 같아도 타입의 순서 및 타입이 다르면 다른 메소드로 인식
	//같은 역할을 하는 메소드는 같은 메소드 이름을 가져야한다.
}
