package application;

public class Model {
// ��ü���� ������ ó���Ѵ�.
	
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
