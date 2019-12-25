package lecture_three;

public class Example_one {

	public static void main(String args[]) {
		
		Example_one salary = new Example_one();
		System.out.println(salary.getMonthlySalary(20000000));
		
	}
	
	public double getMonthlySalary(int yearlySalary) {
		
		double monthlySalary = yearlySalary / 12.0;
		Example_one salary = new Example_one();
		double tax = salary.calculateTax(monthlySalary);
		double pension = salary.calculateNationalPension(monthlySalary);
		double health = salary.calculateHealthInsurance(monthlySalary);
		
		double totalTax = tax + pension + health;
		monthlySalary -= totalTax;
		
		return monthlySalary;
	}
	
	public double calculateTax(double monthSalary) {
		
		double calTax = monthSalary / 1000 *125;
		System.out.println(calTax);
		
		return calTax;
		
	}
	
	public double calculateNationalPension(double monthSalary) {
		
		double calTax = monthSalary / 1000 *81;
		System.out.println(calTax);
		
		return calTax;
		
	}
	
	public double calculateHealthInsurance(double monthSalary) {
		
		double calTax = monthSalary / 1000 *135;
		System.out.println(calTax);
		
		return calTax;
		
	}
	
	// ������ �̿� ���� ���α׷��� ������ ��� double�̳� float�� ����ϸ� �ȵ� - 13��
}
