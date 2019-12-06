package chap03;
//기본형과 참조형 변수의 비교
public class VariableTest {

	public static void main(String[] args) {
		//기본형 변수
		int i = 10;
		int j = 10;
		System.out.println("==============기본형==============");
		if(i==j){
			System.out.println("기본형 같다.");
		}else {
			System.out.println("기본형 다르다.");
		}
		//참조형 변수 : heap에 할당된 객체의 주소값을 갖고있는 변수다. 
		System.out.println("==============참조형===============");
		String str1 = new String("java");
		String str2 = new String("java");
		//str1 = str2; str2값이 str1에 복사되어 str1과 str2이 가리키는 곳이 같다. 
		if(str1==str2) {//각자 heap에 할당된 객체의주소값을 갖고있기 때문에 다르다. 
			System.out.println("참조형 같다.");
		}else {
			System.out.println("참조형 다르다.");
		}
		
		//문자열 비교 - String클래스 메소드로 처리
		if(str1.equals(str2)) {
			System.out.println("문자열 같다.");
		}
		else {
			System.out.println("문자열 다르다.");
		}
		
		boolean result = str1.equals(str2); //boolean은 0 1 만 있다.
		// if문에 result에 바로 str1.equals(str2) 써도 된다. 
		if(result == true) {
			System.out.println("문자열 같다.");
		}
		else {
			System.out.println("문자열 다르다.");
		}
	}

}
