package chap03; // chap03폴더를 생성하고 이안에 APITest.class를 저장한다.
// ctrl + shift + o 누르면 자동으로 import 목록 생성
//java.io 패키지의 모든 것을 인식시키기
import java.io.File;
import java.util.ArrayList;
import java.util.Random; // Random클래스만 인식시키기 
//java.lang패키지만 기본으로 인식하므로 다른 패키지안에 존재하는 클래스를 사용하는 경우 
//어떤 패키지에 잇는지 인식시키는 작업을 해야한다. 

//1. API에서 제공하는 클래스를자바 프로그램 안에서 사용하기위해 메모리에 올리는 작업
// - JVM이 인식하는 작업 공간에 할당
// 문법 : 사용할클래스명 변수 = new 사용할클래스명()

public class APITest {
//API 사용하기 - 참조형 변수 선언
	public static void main(String[] args) {
//1. API에서 제공하는 클래스를 자바 프로그램 안에서 사용하기 위해 메모리에 올리는 작업
		//new String();//스트링 클래스를 메모리에 올리려면 new를 써야한다.
		//heap에 스트링이라는 클래스가 올라가있따.
		// 똑같은 타입으로 변수를 선언해서 받아주는 작업까지 한다.(받아서 메인 공간에서 써야하니까)
		String str = new String();
		StringBuffer sb = new StringBuffer();
		
		//나머지 패키지는 자동으로 인식 못해서 이런 클래스를 쓰려면
		// 자바 인터프리터한테 알려줘야하는데 그 작업이 import입니다.
		File file = new File("test.txt");
		
		Random rand = new Random();
		ArrayList list = new ArrayList();
		
//2. 객체(클래스를 사용하기위해 메모리에 올려놓은 것)의 메소드 사용하기
// ->인스턴스 라고도 함
		String str2 = new String("java programming");//어떤 문자열에 대한 건지 괄호 안에 써준다
		char returnValue = str2.charAt(0);//문자열에서 해당 위치에 있는 것을 문자로 반환
		//charAt의 실행 결과가 char타입이므로 같은 타입의 변수를 선언해서 저장
		System.out.println("실행결과->"+returnValue);
		
		//i love you라는 문자열을 이용해서 String객체를 생성하고
		//이 문자열의 길이를 다음과 같은 형식으로 출력하세요.
		//[출력형태]
		//문자열의 길이 => ___
		String str3 = new String("I love you");
		int leng = str3.length();
		System.out.println("실행결과=>" + leng);
		

	}
}
