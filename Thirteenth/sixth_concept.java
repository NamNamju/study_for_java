package lecture_twelve;

public class sixth_concept {
	
	public static void main(String []args) {
		sixth_concept sample = new sixth_concept();
		sample.throwException(13);
		try {
		sample.throwsException(13);
		// throwsException 메소드를 호출한 메소드에서는 반드시 try-catch블록으로 메소드를 감싸주어야 한다.
		// 혹은 main(String []args) throws Exception 라고 선언한다. 하지만 이것은 좋은 방법이 아님.
		
		} catch(Exception e) {
			
		}
	}
	
	public void throwException(int number) {
		try {
			if (number > 12) {
				throw new Exception("Number is over than 12");
				//throw라고 명시한 후 예외 클래스의 객체를 생성한다.
				
			}
			
			System.out.println("Number is "+number);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void throwsException(int number) throws Exception {
		/*
		 * 매개 변수 소괄호 뒤에 throws라는 예약어를 적어 준 뒤 예외를 선언하면, 해당 메소드에서 선언한 예외가 발생했을 때 호출한 메소드로 예외가 전달된다.
		 * 두 가지 이상의 예외를 던질 수 있다면, implements처럼 콤마로 구분한다. Ex) throws NullPointerException, Exception
		 */
		// 이렇게 throws를 메소드 선언에 해놓으면 예외가 발생했을 때 try-catch로 묶어주지 않아도 된다.
		
		if (number > 12) {
			throw new Exception("Number is over than 12");
		}
		
		System.out.println("Number is "+number);
	}

}
