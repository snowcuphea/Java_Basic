package oop.chap06;

public class ConsPerson { 
	
	private String name; 
	private String addr;
	private int age;
	
	public ConsPerson() {
	}
	
	public ConsPerson(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
		
//	public void setName(String name) { 
//		
//		this.name = name; 
//	}
//	
//	public void setAddr(String addrr) {
//		this.addr = addrr;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	

	@Override
	public String toString() {
		return "ConsPerson [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	public String getName() {
		return this.name; 
		
	}
	

	public String getAddr() {
		return this.addr;
	}
	
	public int getAge() {
		return this.age;
	}
	

	
}
