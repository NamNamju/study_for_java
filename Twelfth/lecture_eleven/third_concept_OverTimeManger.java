package lecture_eleven;

public class third_concept_OverTimeManger {

	public int getOverTimeAmount(third_concept_enumValue1 value) {
		int amount = 0;
		System.out.println(value);
		switch(value) {
		case THREE_HOUR:
			amount = 18000;
			break;
			
		case FIVE_HOUR:
			amount = 30000;
			break;
			
		case WEEKEND_FOUR_HOUR:
			amount = 40000;
			break;
			
		case WEEKEND_EIGHT_HOUR:
			amount = 60000;
			break;
		}
		
		return amount;
	}
	
	public static void main(String args[]) {
		third_concept_OverTimeManger manager = new third_concept_OverTimeManger();
		int myAmount = manager.getOverTimeAmount(third_concept_enumValue1.THREE_HOUR);
		/*
		 * 위의 코드는 이와 같다.
		 * third_concept_enumValue1 value = third_concept_enumValue1.THREE_HOUR;
		 * int myAmount = manger.getOverTimeAmount(value);
		 */
		System.out.println(myAmount);
	}
}
