package oop.chap06;
//클래스를 정의하고 멤버변수를 정의하는 방법
// - 멤버변수를 정의할 때에는 특별한 경우를 제외하고 초기값을 주지 않는다.
// - 초기값을 정의하지 않아도 참조형은 null, 정수형 0, 실수형 0.0, boolean은 false => 배열과 동일하다.
//접근을 제어할 수 있는 키워드가 있다. 멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 이싿.
// public
// default
// private

//클래스를 정의할 때 멤버변수는 private으로 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고
//public메소드를 통해서 접근할 수 있도록 구현한다.
public class Person { //자바는 유니코드방식이라 한글도 사용가능하긴 하다. 나중에 시스템에서 깨진다
	
	//데이터 숨겨놓기 (private)
	private String name; //클래스의 특성을 나타내는 데이터 - 멤버변수 or 필드(API에서 쓰는 용어)
	private String addr;//성명 주소 나이는 person을 대표할 수 있는 것들
	private int age;
	//멤버변수와 일반 int num 변수의 차이점은?
	//int num 이런거는 클래스를 대표하는 데이터가 아니라, 임시로 값을 보관하기 위해 선언한 변수
	//하지만 name addre age는 클래스를 대표하는 데이터가 될 것이다.
	// 이런 클래스를 대표하는 멤버변수들은 클래스 선언부 바로 밑에 정의하는 작업을 해야한다. 
	
	//데이터 타입은 기본형, 참조형 모든 타입 다 올 수 있다.
	
	//모든 멤버변수는 private으로 선언되어 있기 때문에 값을 설정하는 메소드와, 값을 가져올 수 있는 메소드가 필요하다.
	//이런 역할을 하는 메소드를 정의하는 경우,
	
	//name 변수에 값을 설정하는 메소드 (값을 변경해주는 기능. 값을 변경하기만 하고 반환값 없어서 리턴타입은 void)
	//메소드명 : set + 멤버변수명(첫 글자를 대문자로 바꾼)
	//			setName
	public void setName(String name) { //값을 바꾸는 메소드 : setter 메소드
		
		this.name = name; //멤버변수와 지역변수가 같으면 warning이 뜬다 
		//따라서 여기의 name에 this 라고 써준다. 
	}
	
	public void setAddr(String addrr) {
		this.addr = addrr;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//name변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드
	//메소드명 : get + 멤버변수명(첫글자를 대문자로 바꿈) -> getName
	
	public String getName() {
		return this.name; //클래스에 선언된 name 변수
		
	}
	
	public String getAddr() {
		return this.addr;
	}
	
	public int getAge() {
		return this.age;
	}
	

	
}
