package lecture_nine;

public class forth_concept_print {

	public static void main(String[] args) {
		forth_concept_print print = new forth_concept_print();
		print.callPrintNames();

	}
	
	public void callPrintNames() {
		forth_concept_parent parent1 = new forth_concept_parent();
		forth_concept_parent parent2 = new forth_concept_inherit();
		forth_concept_parent parent3 = new forth_concept_inherit2();
		
		parent1.printName();
		parent2.printName();
		parent3.printName();
	}

}
