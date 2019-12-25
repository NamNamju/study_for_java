package lecture_four;

public class Example_one {

	public static void main(String args[]) {
		Example_one cal = new Example_one();
		
		for (int day = 1; day <= 365; day++)
		{
			System.out.println(cal.calculateAmount(day,1000000));
		}
	}
	
	public double getInterestRate(int day) {
		
		double rate;
		if (day <= 90) {
			rate = 0.5;
			
		}
		else if (91 <= day && day <= 180) {
			rate = 1;
		}
		else if (181 <= day && day <= 364) {
			rate = 2;
		}
		else {
			rate = 5.6;
		}
		return rate;
	}
	
	public double calculateAmount(int day, long amount) {
		
		Example_one cal = new Example_one();
		double rate = cal.getInterestRate(day);
		double money = amount + amount * rate / 100.0;
		return money;
	}
	
	
	
}
