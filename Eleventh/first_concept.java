package lecture_ten;

public class first_concept {

	public static void main(String[] args) {
		first_concept object = new first_concept();
		object.toStringMethod(object);

	}
	
	public void toStringMethod(Object obj) { // Ŭ������ Object Ŭ������ ����� �ڵ����� �޴´�.
		System.out.println(obj);
		System.out.println(obj.toString()); // ��ü�� ó���ϱ� ���� �޼ҵ� �� �ϳ�
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		System.out.println("plus "+obj);
		System.out.println("plus "+this); // ���� ���� ��� (this = �ڱ� �ڽ��� ��Ÿ���� ��ü)
		
		//toString�� Overriding �� �� ���ȴ�.
		
	}

}
