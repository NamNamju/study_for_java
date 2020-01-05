package lecture_thirteen;

public class Example_one {

	public static void main(String[] args) {
		Example_one sample = new Example_one();
		String str = new String("The String class represents character strings.");
		sample.printWords(str);
		sample.findString(str, "string");
		sample.findAnyCaseString(str, "string");
		sample.countChar(str, 's');
		sample.pirntContainWords(str, "ss");
	}

	public void printWords(String str) {
		String[] text = str.split(" ");
		
		for (String string : text) {
			System.out.println(string);
		}
	}
	
	public void findString(String str, String findStr) {
		System.out.println(findStr+ " is appeared at " +str.indexOf(findStr));
	}
	
	public void findAnyCaseString(String str, String findStr) {
		System.out.println(findStr+ "is appeared at " +str.toLowerCase().indexOf(findStr));
	}
	
	public void countChar(String str, char c) {
		char [] values = {};
		int count = 0;
		values = str.toCharArray();
		
		for (int i = 0 ; i < values.length ; i++) {
			if (values[i] == c)  count++;
		}
		
		System.out.println("char 's' count is " +count);
	}
	
	public void pirntContainWords(String str, String findStr) {
		String[] text = str.split(" ");
		for (int i = 0; i < text.length ; i++) {
			if (text[i].contains(findStr)) {
				System.out.println(text[i] + " contains " +findStr);
			}
		}
	}
}

