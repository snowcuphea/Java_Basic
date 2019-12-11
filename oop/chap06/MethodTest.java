package oop.chap06;
//메소드의 매개변수와 리턴타입으로 참조형, 배열, 기본형 모두 사용할 수 있다.
public class MethodTest {
	public static void main(String[] args) {
		ConsPerson p = new ConsPerson("민정", "일산", 26);
		
		display(p.getName(),p.getAddr(), p.getAge());
		display(p); //ConsPerson객체를 매개변수로 전달할 수 있다.
		//객체를 통째로 넘길 수 있다.

	}
	public static void display(String name, String addr, int age) {
		System.out.println(name+","+addr+","+age);
	}
	public static void display(ConsPerson p) {
		System.out.println(p.toString()); //p객체가 갖고있는 정보를 출력한다. (주소로 나옴)
		
	}
	
	//메소드를 정의할때 한 개의 값만 리턴할 수 있는데
	//동일한 타입의 데이터를 여러 개 리턴해야 한다면, 배열을 리턴타입으로 정의하고
	//사용할 수 있다.
	public static int[] addNumber() {//리턴타입이(반환값이) int[]
		int[] myarr = new int[3];
		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 300;
		
		return myarr;
		
	}
	//타입이 다른 여러 개의 데이터를 리턴하고 싶은경우
	//배열로 리턴할 수 없으므로 리턴하고 싶은 값을 갖고 있는 객체를 생성해서 
	//리턴할 수 있다.
//	public static Stustu getInfo() {
//		//Student의 모든 정보를 리턴
//		
//		return new Stustu("장동건", 90, 100, 50, 78);
//		
//	}
//	

}
