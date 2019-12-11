package oop.chap06;

public class NewStudent {
	
	private String name;
	private String addr;
	private int age;
	
	public NewStudent() {
		
	}
	
	public NewStudent(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

}
