package chap09.api.lang;

public class Person { //아무것도 상속하는게 없으면 컴파일러가 자동으로 extends Object 해줌
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
//	public String toString() { // 오버라이딩
//		return this.name+"," + this.age + "," + this.addr;
//	}
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() { //개발자가 작성하는 모든 클래스에서 오버라이딩 해야한다. 
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
