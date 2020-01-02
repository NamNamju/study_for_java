package lecture_eleven;

public enum third_concept_enumValue2 {

	//enum ��� ���� �����Ѵ�.
	THREE_HOUR(18000),
	FIVE_HOUR(30000),
	WEEKEND_FOUR_HOUR(40000),
	WEEKEND_EIGHT_HOUR(60000);
	
	// �����ڿ��� �Ű� ������ �Ѱܹ��� ���� �Ҵ��� �� ����Ѵ�.
	private final int amount;
	
	//enum Ŭ������ �����ڴ� �ƹ��͵� ������� ���� package-private�� private�� ��� �����ϴ�.
	third_concept_enumValue2(int amount) {
		this.amount = amount;
	}
	
	//enum Ŭ������ ������ ������ amount ���� �����Ѵ�.
	public int getAmount() {
		return amount;
	}
}
