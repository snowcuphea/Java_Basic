package oop.chap07.poly;
//객체의 형변환 - 상속관계에 있는 경우에만 가능하다.

class Parent{
	String name = "장동건";
	public void display() {
		System.out.println("부모클래스의 display");
	}
}

class Child extends Parent{
	String name = "이민호";
	public void display() {
		System.out.println("자식클래스의 display");
	}
	public void test() {
		System.out.println("하위클래스에만 정의된 메소드 ");
	}
}

class Child2 extends Parent{
	public void display() {
		System.out.println("자식클래스의 display");
	}
}

public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1. super타입의 참조변수로 Super객체를 참조");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("************************************************");
		System.out.println("2. sub타입의 참조변수로 sub객체를 참조");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		/*
		
		 * 	- 변수는 참조변수타입에 따라서 결정, 메소드는 생성되는 객체가 기준
		 */
		
		System.out.println("************************************************");
		System.out.println("3. super타입의 참조변수로 sub객체를 참조");
		Parent obj3 = new Child();  //생성된 객체가 자동적으로 패런트정보를 갖고있기 때문에 가능(차일드가 패런트포험(상속)하니까)
		//마치 큰 변수타입에 작은 변수타입을 넣는 것처럼 가능. //자동형변환 된다. 
		obj3.display(); //메소드 : 오버라이딩된 메소드라면 오버라이딩된 메소드가 호출됨
		System.out.println(obj3.name);//변수: 참조변수 타입에 해당하는 
										//클래스의 멤버변수가 실행 
		//타입이 parent타입이지만 실제로 생성된 객체가 child타입이기 때문에 
		//child타입으로 형변환이 가능하다. (명시적)
		//obj3.test()// 접근 불가.
		((Child)obj3).test(); //현재 obj3의 변수타입은 패런트지만, 명시적 형변환을 통해 child로 변경가능.
		System.out.println("************************************************");
		System.out.println("4. sub타입의 참조변수로 super객체를 참조");
		//Child obj4 = new Parent(); // 불가능. 
		//Cannot convert from parent to child : 부모를 자식으로 형변환 할 수 없다. 
		
		//타입이 패런트기 때문에 패런트밖에 접근 못한다.
		//변수는 레퍼런스타입(참좋여변수가 무슨타입이냐_ )에따라 접근여부, 실행여부 결정되고 
		//메소는 생성되는 객체가 뭐냐에 따라 판단된다.
		//타입이 패런트기때문에 접근할 수 있는건 패런트 메소드밖에 없다. 차일드 매소드로는 접근 못한다.
		//접근하기위해서는 변수 자체를 명시적으로 캐스팅 해야한다. 
		
		System.out.println("************************************************");
		System.out.println("5. sub타입의 참조변수 = super타입의 참조변수(Super객체를참조)");
		//명시적으로 형변환을 해서 문법적으로 컴파일러는 속였으나, 실제 실행시점에 캐스팅을 하려고 할 때
		//obj1이 Child정보를 갖고있지 않기 때문에 캐스팅 예외발생 
		//컴파일러 속이고 실행 하려고 까보니까 Child정보를 갖고있지 않아...
		//Child obj5 = (Child)obj1; //obj1는 패런트타입 변수
		
		System.out.println("************************************************");
		System.out.println("6. sub타입의 참조변수 = super타입의 참조변수(Sub객체를참조)");
		Child obj6 = (Child)obj3; 
		System.out.println(obj6.name); //변수는 타입에 의존. obj6은 차일드 타입이라 이민호 나옴
		obj6.display();
		obj6.test();
		
		//obj1과 obj3둘다 패런트 변수긴 하지만 obj1은 패런트 정보만 갖고있꼬
		//obj3이 참조하는 객체가 차일드 정보를 갖고 잇끼 때문에 캐스팅이 가능하다.
		
		
		//캐스팅을 할때에는 참조하는 객체를 보자
		
		Parent obj7 = obj2;
		
		Parent obj8 = null;; //교재의 car변수
		Child obj9 = new Child(); //fe
		Child obj10 = null; //fe2
		
		obj8 = obj9; //super타입 = sub타입
		obj10 = (Child)obj8; //바로윗줄에서 obj8에다가 obj9를 넣음
		//obj9는 차일드. obj8은 차일드를 레퍼런스 하니까, 차일드에 대한 정보를 갖고있다.
		//8이 차일드를 참조하고있지만, 여전히 8은 패런트 타입이다. 가리키는 것은 차일드긴 하지만.
		//그래서 명시적으로 캐스팅을 해주는 것이다. 10이 차일드니까.
		
		//참조변수는 주소저장하고있어
		//실제 참조하고 있는 것에 따라 캐스팅 유무 
		//접근할 수 있는 범위의 허용은 타입에 잇는것만 본다. 
		
		//캐스팅을 할 수 있다라는 것은
		
		//아무것도 참조하지 않으면 캐스팅은 가능하다. 하지만 출력하면 빈 값이 나오니까 에러
		//ex. obj8 = obj9; 문장 지우고
		//obj10 = (Child)obj8; obj10.test(); 적어보자.
		
		
	}

}
