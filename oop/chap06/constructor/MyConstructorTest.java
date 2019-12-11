package oop.chap06.constructor;

public class MyConstructorTest {
	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();//기본생성자가 호출됐다
		//기본생성자 만든 적 없다. 자동으로 만들어짐 
		//컴파일 할 때 컴파일러가 코드를 확인하고 기본생성자가 없으면 자동으로 만들어준다. 
		
		obj.setName("장동건");
		obj.setId("jang");
		obj.setPass("1234");
		
		System.out.println(obj.getName() +", " + obj.getId() + ", "+ obj.getPass());

		//매개변수가 있는 생성자 메소드를 호출하면서 값을초기화하기
		//MyConStructor(String, String, String)
		MyConstructor obj2 = new MyConstructor("장동건", "jang", "1234");
		
		System.out.println("=================================================");
		System.out.println(obj2.getName() +", " + obj2.getId() + ", "+ obj2.getPass());
		//같은 결과인데, 코드가 줄어들었다. 효율적이다. 
		
		System.out.println("=================================================");
		
		//MyConstructor(String, String, String, String)
		MyConstructor obj3 = new MyConstructor("장동건", "jang", "1234","쨩");
		
		System.out.println(obj3.getName() +", " + obj3.getId() + ", "+ obj3.getPass()
						+obj3.getNickname());
		
		//MyConstructor(String, String, String, String, int)
		MyConstructor obj4 = new MyConstructor("장동건", "jang", "1234","쨩","일산",1000);
				
		System.out.println(obj4.getName() +", " + obj4.getId() + ", "+ obj4.getPass()
								+obj4.getNickname() + ", " + obj4.getAddr()+","+obj4.getPoint());
		
		
		
	}

}
