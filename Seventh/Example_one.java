package lecture_five;

public class Example_one {

	int [][]gradeHeights;
	
	public static void main(String[] args) {

		Example_one array = new Example_one();
		array.setData();
		for (int i = 0; i<array.gradeHeights.length;i++)
		{
		System.out.println("Class No.:"+(i+1));
		array.printHeight(i);
		}
		
		int i = 0;
		while(i!=5)
		{
			System.out.println("Class No.:"+(i+1));
			array.printAverage(i);
			i ++;
		}
		

	}
	
	public void setData() {
		gradeHeights = new int[5][0];
		
		gradeHeights[0] = new int[]{170,180,173,175,177};
		gradeHeights[1] = new int[]{160,165,167,186};
		gradeHeights[2] = new int[]{158,177,187,176};
		gradeHeights[3] = new int[]{173,182,181};
		gradeHeights[4] = new int[]{170,180,165,177,172};
		
	}

	public void printHeight(int classNo) {
		for (int i = 0; i < gradeHeights[classNo].length; i++)
		{
			
			System.out.println(gradeHeights[classNo][i] + " ");
		}
		
	}
	
	public void printAverage(int classNo)
	{
		double sum=0;
		for (int i = 0; i < gradeHeights[classNo].length;i++)
		{
			sum+=gradeHeights[classNo][i];
		}
		System.out.println("Height average:"+sum/gradeHeights[classNo].length);
		
	}
}
