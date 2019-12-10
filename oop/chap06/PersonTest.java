package oop.chap06;
//Person클래스를 사용하는 클래스
public class PersonTest {
//API사용하는 방법과 같다.
	public static void main(String[] args) {
		
		Person p1 = new Person(); //new라는연산자를 이용해서 heap에다 올려놓고 사용
		p1.setName("장동건"); // 이 값이 person의 setName(String name)으로 들어가서 this.name이 장동건으로 바뀜
		p1.addr = "서울시";
		p1.age = 45;//age변수는 private로 선언되어 있으므로 접근할 수 없다.
					//같은 패키지의 클래스에서도 접근할 수 없다. 
		System.out.println("성명:"+p1.getName()); //
		System.out.println("주소:"+p1.addr);//p1을 통해서 name,age,addr 등등 접근 가능
		System.out.println("나이:"+p1.age);
		
		Person p2 = new Person(); //new라는연산자를 이용해서 heap에다 올려놓고 사용
		p2.name = "김민정";
		p2.addr = "고양시";
		p2.age = 26;
		//직접적으로 액세스해서 값을 할당
		
		
		System.out.println("성명:"+p2.name); //p1을 통해서 name,age,addr 등등 접근 가능
		System.out.println("주소:"+p2.addr);
		System.out.println("나이:"+p2.age);
		
		
	}

}
