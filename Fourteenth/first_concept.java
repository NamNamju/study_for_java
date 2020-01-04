package lecture_thirteen;

public class first_concept {

	public static void main(String [] args) {
		first_concept sample = new first_concept();
		sample.convert();
	}
	
	public void convert() {
		try {
			
			String korean = "한글"; // "한글"이라는 값을 갖는 String 객체인 korean을 생성.
			byte[] array1 = korean.getBytes(); // korean을 byte 배열로 만들었음.
			
			for(byte data : array1) {
				System.out.print(data + " "); // byte 값만 출력.
			}
			
			System.out.println();
			String korean2 = new String(array1);
			System.out.println(korean2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
