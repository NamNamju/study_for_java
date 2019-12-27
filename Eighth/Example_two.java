package lecture_six;

public class Example_two {

	public static void main(String[] args) {
		Example_one[] student = null;
		Example_two manageStudent = new Example_two();
		student = manageStudent.addStudent();
		manageStudent.printStudents(student);
	}
	
	public Example_one[] addStudent() {
		Example_one[] student = new Example_one[3];
		student[0] = new Example_one("Lim");
		student[1] = new Example_one("Min");
		student[2] = new Example_one("Sook", "Seoul", "010XXXXXXXX", "namju@namjuhi.com");
		return student;
	}
	
	public void printStudents(Example_one[] student) {
		
		for (Example_one std: student) {
			System.out.println(std);
		}
	}
}
