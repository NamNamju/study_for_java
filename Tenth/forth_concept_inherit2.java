package lecture_nine;

public class forth_concept_inherit2 extends forth_concept_parent{

public forth_concept_inherit2() {
		System.out.println("Child2 Constructor");
	}
	
	public forth_concept_inherit2(String name) {
		
	}
	
	public void printName() {
		System.out.println("printName() - Child");
	}
	
	public void pringAge() {
		System.out.println("printAge() - 18 month");
	}
}
