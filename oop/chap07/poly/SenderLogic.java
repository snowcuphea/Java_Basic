package oop.chap07.poly;
public class SenderLogic {
	public void run(Sender obj) { //Sender클래스의 클래스들을활용하는 메소드
		//EmailSender, SMSSender로 하지 않아도 된다. Sender타입으로 하면 된다.
		System.out.println("실행완료");
		
		//부모타입 변수로 선언하면, 어떤 객체가 전달된다고 하더라도EmailSender, SMSSender 등등 다 받을 수 잇다.
		
		obj.print();//타입이 센더타입. 패런트타입이다. 타입이 패런트는 패런트밖에 접근 못함
		//★센더에 프린트가 없다.. Sender에 프린트가 없기 때문에 호출 불가
		
		//★따라서 Sender클래스에 print메소드 선언해주면 된다. 
	}
	

}
