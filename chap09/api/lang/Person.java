package chap09.api.lang;

public class Person { //�ƹ��͵� ����ϴ°� ������ �����Ϸ��� �ڵ����� extends Object ����
	String name;
	int age;
	String addr;
	public Person() {
		
	}
	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
//	public String toString() { // �������̵�
//		return this.name+"," + this.age + "," + this.addr;
//	}
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() { //�����ڰ� �ۼ��ϴ� ��� Ŭ�������� �������̵� �ؾ��Ѵ�. 
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	

}
