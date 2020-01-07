package application;

public class Model {
// 구체적인 연산을 처리한다.
	
	public int calculator(String operator, int x, int y) {
		if (operator.equals("+")) {
			return x+y;
		}
		else if (operator.equals("-")) {
			return x-y;
		}
		else if (operator.equals("/")) {
			return x/y;
		}
		else {
			return x*y;
		}
		
	}
}
