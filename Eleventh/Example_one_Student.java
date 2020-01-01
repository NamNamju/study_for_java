package lecture_ten;

public class Example_one_Student {

	public String name;
	public String address;
	public String phone;
	public String email;
	
	public Example_one_Student(String name, String address, String phone, String email)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		
	}
	public boolean equals(Object obj) {
		
		if (this == obj) return true;  // �ּҰ� �����Ƿ� �翬�� true
		if (obj == null) return false; // obj�� null�̹Ƿ� �翬�� false
		
		if (getClass() != obj.getClass()) return false; // Ŭ������ ������ �ٸ��Ƿ� false
		
		Example_one_Student other = (Example_one_Student) obj; // ���� Ŭ�����̹Ƿ� ����ȯ
		
		// ������ �� �ν��Ͻ� ������ ������ ���ϴ� �۾�
		
		if (name == null) { // name�� null�� ��
			if (other.name != null) return false; // �� ����� name�� null�� �ƴϸ� false
			
		}else if (!name.equals(other.name)) return false; // �� ���� name ���� �ٸ��� false
		
		//
		
		if (address == null) {
			if (other.address != null) return false;
			
		} else if (!address.equals(other.address)) return false;
		
		//
		
		if (phone == null) {
			if (other.phone != null) return false;
					
		} else if (!phone.equals(other.phone)) return false;
				
		//
		
		if (email == null) {
			if (other.email != null) return false;
			
		} else if (!email.equals(other.email)) return false;
		
		
		
		//false�� �������� �ʾҴٸ� true�� ������
		
		return true;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		
		return result;
	}
}
