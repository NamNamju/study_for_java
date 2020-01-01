package lecture_ten;

public class Example_one_ManageStudent {

	
	public void checkEquals() {
		
		Example_one_Student a = new Example_one_Student("Min", "Seoul", "010XXXXXXXX", "namju@hi.com");
		Example_one_Student b = new Example_one_Student("Min", "Seoul", "010XXXXXXXX", "namju@hi.com");
		
		if(a.equals(b)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
	public static void main(String[] args) {
		Example_one_ManageStudent Manage = new Example_one_ManageStudent();
		Manage.checkEquals();

	}

}
