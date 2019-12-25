package lecture_four;

public class third_concept {

	public static void main(String[] args) {
		third_concept control = new third_concept();
		control.printTimesTable();

	}
	
	public void printTimesTable() {
		for (int i = 1; i < 10; i++)
		{
			for (int j = 1; j < 10; j++)
			{
				System.out.print(i+"*"+j+"="+i*j+" ");
				
			}
			System.out.println(" ");
		}
	}

}
