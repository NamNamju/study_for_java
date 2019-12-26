package lecture_five;

public class third_concept{

	public static void main(String args[]) {
	third_concept array = new third_concept();
	array.newFor();
	if(args.length>0) {
		for(String arg:args) {
			System.out.println(arg); // 자바 실행시 원하는 값 넘김
		}
	}
	}	
	
	public void newFor() {
		int [] oneDim = new int[] {1,2,3,4,5,6,7};
		for(int data:oneDim) {
			System.out.print(data+" ");
		}
		
		System.out.println();
		
		int [][] twoDim = {{1,2,3},{4,5,6}};
		for(int[] dimArray:twoDim)
		{
			for(int data:dimArray) {
				System.out.print(data+" ");
			}
		}
	}
}
