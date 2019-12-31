package lecture_ten;

public class second_concept_DTO {

	public String name;
	public String phone;
	public String email;
	
	public second_concept_DTO (String name) {
		
	}
	
	public boolean equals(Object obj) {
		/*
		 * ����
		 * ���, ��Ī, Ÿ����, �ϰ�, null���� ��
		 */
		
		if (this == obj) return true;  // �ּҰ� �����Ƿ� �翬�� true
		if (obj == null) return false; // obj�� null�̹Ƿ� �翬�� false
		
		if (getClass() != obj.getClass()) return false; // Ŭ������ ������ �ٸ��Ƿ� false
		
		second_concept_DTO other = (second_concept_DTO) obj; // ���� Ŭ�����̹Ƿ� ����ȯ
		
		// ������ �� �ν��Ͻ� ������ ������ ���ϴ� �۾�
		
		if (name == null) { // name�� null�� ��
			if (other.name != null) return false; // �� ����� name�� null�� �ƴϸ� false
			
		}else if (!name.equals(other.name)) return false; // �� ���� email ���� �ٸ��� false
		
		// name�� ����
		
		if (email == null) {
			if (other.email != null) return false;
			
		} else if (!email.equals(other.email)) return false;
		
		// name�� email�� ����
		
		if (phone == null) {
			if (other.phone != null) return false;
			
		} else if (!phone.equals(other.phone)) return false;
		
		//false�� �������� �ʾҴٸ� true�� ������
		
		return true;
	}
	
	//equals�� overriding �� ������ hashCode�� ���� overriding ����� �Ѵ�.
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		
		return result;
	}
	
	/*
	 * �׻� ������ int ���� ������ �־�� �Ѵ�.
	 * equals() �޼ҵ带 ����� ����� true�� ��� �� ��ü�� ������ int���� �����ؾ� �Ѵ�.
	 * ������ false�� �����ߴٰ� �ؼ� ȣ���� int ���� ������ �޶�� �� �ʿ�� ����.
	 */
}
