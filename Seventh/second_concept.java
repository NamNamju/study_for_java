package lecture_five;

public class second_concept {

	public static void main(String [] arg) {
		
		second_concept array = new second_concept();
		
		int [][]twoDim = {{1,2,3},{4,5,6}};
		twoDim = new int[2][3];
		// twoDim = new int[2][]; (O)
		// twoDim = new int[][2]; (X)
		// twoDim = new int[][];  (X)
		
		/*2차원 배열 따로 지정 방법
		 twoDim[0] = new int[3];
		 twoDim[1] = new int[2];
		 */
		
		array.printArrayLength();
		
	}
	
	public void printArrayLength() {
		int[] oneDim = new int[3];
		int[][] twoDim = new int[4][2];
		System.out.println(oneDim.length);
		System.out.println(twoDim.length);
		System.out.println(twoDim[0].length);
	}
}
