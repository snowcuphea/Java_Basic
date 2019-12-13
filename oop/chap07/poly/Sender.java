package oop.chap07.poly;
public abstract class Sender {
	String name;
	Sender(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//★ 그래서 print메소드 정의해주자.
	//근데 print에 기술할 내용이 없어서 바디를없애고 abstract로 해준다. 
	//클래스명앞에도 abstract추가해주자. 
	public abstract void print();
}

