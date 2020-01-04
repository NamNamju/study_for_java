package lecture_thirteen;

public class fourth_concept {

	public static void main(String[] args) {
		fourth_concept sample = new fourth_concept();
		String addresses[] = new String[] {
				"서울시 구로구 신도림동",
				"경기도 성남시 분당구 정자동",
				"서울시 구로구 개봉동",
		};
		sample.checkAddress(addresses);
		sample.checkMatch();
		sample.checkIndexOf();
		sample.subString();
		sample.checkSplit();
	}
	
	public void checkAddress(String[] addresses) {
		int startCount = 0, endCount = 0, containCount = 0;
		String startText = "서울시";
		String endText = "동";
		String containText = "구로구";
		for(String address : addresses) {
			if(address.startsWith(startText)) {
				// startText로 시작하는 문자열을 찾을 수 있다.
				startCount++;
			}
			
			if(address.endsWith(endText)) {
				// endText로 끝나는 문자열을 찾을 수 있다.
				endCount++;
			}
			
			if(address.contains(containText)) {
				// containText를 포함하는 문자열을 찾을 수 있다.
				containCount++;
			}
		}
		
		System.out.println("Starts with "+startText+" count is "+startCount);
		System.out.println("Ends with "+endText+" count is "+endCount);
		System.out.println("Contains "+containText+" count is "+containCount);
	}
	
	public void checkMatch() {
		String text = "This is a text";
		String compare1 = "is";
		String compare2 = "this";
		System.out.println(text.regionMatches(2, compare1, 0, 1));
		System.out.println(text.regionMatches(5, compare1, 0, 2));
		// (비교 대상 문자열의 확인 시작 위치를 지정, 확인할 문자열, 시작 위치, 개수)
		
		System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
		// 앞의 매개변수인 true는 ignoreCase로, true일 경우 대소문자 구분 하지 않고, 값을 비교 한다.
	}
	
	public void checkIndexOf() {
		String text = "Java technology is both a programming language and a platform. ";
		System.out.println(text.indexOf('a'));
		System.out.println(text.indexOf("a "));
		System.out.println(text.indexOf('a', 20));
		System.out.println(text.indexOf("a ",20));
		// 앞의 두 코드는 20번째 자리부터 찾는 작업을 수행한다.
		
		System.out.println(text.indexOf('z'));
		// z는 문장에 없으므로 -1을 출력한다.
		// lastIndexOf()라는 메소드를 사용할 경우 뒤에서부터 검색을 시작한다.
	}
	
	public void subString() {
		char values[] = new char[] {'J', 'a', 'v', 'a'};
		String javaText = String.copyValueOf(values);
		// char 배열의 값을 String으로 변환하는 메소드
		
		String text = "Java technology";
		String technology = text.substring(5);
		// 해당 번째부터 text 문자열이 끝날 때까지를 모두 잘라내라는 의미.
		
		String tech = text.substring(5, 9);
		// 해당 번째부터 끝나는 위치까지 잘라내라는 의미.
		
		System.out.println(technology);
		System.out.println(tech);
		
	}
	
	public void checkSplit() {
		String text = "Java technology is both a programming language and a platform. ";
		String[] splitArray = text.split(" ");
		// 문자열을 잘라 String의 배열로 리턴한다.
		
		for(String temp : splitArray) {
			System.out.println(temp);
		}
	}

}
