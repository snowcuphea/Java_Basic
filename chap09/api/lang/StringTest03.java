package chap09.api.lang;
//String클래스의 기본 메소드와 String클래스의 특징
//=> 문자열처리 메소드를 자주 호출하거나 + 연산자로 문자열을 연결하는 작업이 많은 경우
// String을 사용하지 않고 StringBuffer or StringBuilder 를 이용한다. 
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		//원본변환
		System.out.println("str1.toUpperCase()=> "+str1.toUpperCase());
		System.out.println("원본데이터: "+str1);
		System.out.println("str1.toLowerCase()=> "+str1.toLowerCase());
		System.out.println("str1.substring(2)=> "+str1.substring(2));//2번인덱스부터 출력
		System.out.println("str1.substring(2,8)=> "+str1.substring(2,8));//2~7인덱스출력
		System.out.println("str1.replace('a','A')=> "+str1.replace('a','A'));//a를찾아A로바꿈
		System.out.println("원본데이터: "+str1);
		
		//어떤 함수를 사용한다고 해도 원본데이터는 변하지 않았다.
		//String관련 메소드들이 원본을 바꾸는게 아니라 원본을 읽어서 또다른 스트링 객체를 만드는 것이다.
		//문자열조작이 빈번하게 일어나는 곳에서는 string을 쓰지 않는다. 너무 객체가 많이 만들어짐 
		//=> 대안:String buffer나 String builder 사용
		//문자열 내부에서 쓰레드 처리가(동시접속에 대한 고려가) 되어있으면 String buffer
		//서버에서 동시접속에 대한 고려가 되면 String builder
		
		
		
	}

}
