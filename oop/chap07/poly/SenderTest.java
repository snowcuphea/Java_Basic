package oop.chap07.poly;
import java.util.Scanner;
//사용자에게 선택을 하라고 뷰를 만들었따. 
public class SenderTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********Sender시스템********");
		System.out.println("1. Email로 전송");
		System.out.println("2. SMS로 전송");
		System.out.println("3. MMS로 전송");
		System.out.print("원하는 작업을 선택하세요:");
		int work = key.nextInt();
		Sender sender = null; //이메일센더, 문자센더 다 될 수 있기때문에 Sender타입으로 ㄴ선언
		switch(work){
			case 1:
				sender = new EmailSender("메일로전송",100);
				break;
			case 2:
				sender = new SMSSender("단문자",80);
				break;
			case 3:
				sender = new MMSSender("멀티문자",1200);
				break;
				//상위 클래스 에서 기능을 받아서 해당하는 하위 클래스가 기능을 한다. 
				
		}
		SenderLogic s = new SenderLogic();
		s.run(sender);

	}

}
//동일한 타입의 변수를 선언했다. 선언했찌만 실행시점에 다양한 객체가 매핑되게끔설계하고
//실제사용자가 뭘 선택하느냐에따라 다양한 객체 클래스 등등으로 간다.
//그리고 상속
//