package lecture_two;

public class Example_one {

	byte age_;
	String name_;
	boolean isMarried;	
	
	public static void main(String args[]) {
		Example_one profile = new Example_one();
		profile.setAge((byte)20);
		profile.setName("»≤≥≤¡÷");
		profile.setMarried(false);
		System.out.println(profile.getAge());
		System.out.println(profile.getName());
		System.out.println(profile.isMarried());
		
	}
	
	public void setAge(byte age) {
		age_ = age;
	}

	public byte getAge() {
		return age_;
	}
	
	public void setName(String name) {
		name_ = name;
	}
	
	public String getName() {
		return name_;
	}
	
	public void setMarried(boolean flag) {
		
	}
	
	public boolean isMarried() {
		return isMarried;
	}
	
	
	
}
