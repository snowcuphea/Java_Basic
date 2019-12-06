package test.exam;
//자바 기본형 데이터의 리터럴에 대해서 살펴보는 예제
public class PrimitiveTypeTest{
	public static void main(String[] args){
		//boolean형
		boolean boo = true; //true of false
		System.out.println(boo);
		
		//문자형
		char c ='a';//char타입 변수는 리터럴을 표현할 때 ''로 표현
		System.out.println(c);

		//정수형변수
		//정수형변수에기본으로 할당되는 리터럴의 타입은 int
		byte b = 127;
		System.out.println(b);

		short s = 32767;
		System.out.println(s);

		int i = 2147483647;
		System.out.println(i);

		long l = 2147483648L;// long타입 변수에 넣긴 하지만, 
		//리터럴의 값 자체 범위가 인트라서 에러.
		//따라서 L이나 l을 맨 뒤에 붙여주면 됨
		System.out.println(l);

		//실수
		//실수형 리터럴의 기본 타입은 double
		float f = 10.5F; //float = double 의 뜻과 같다.
		//작은 변수에 큰 값을 넣는 꼴이 된다.
		//따라서 마찬가지로, float타입 사용 시 접미사 F나 f를 추가한다.
		System.out.println(f);
		double d = 10.5;
		System.out.println(d);

		// 오른쪽 값은 10/3 해서 int형 3이 나온다. 
		// 그리고 double은 int형 보다 크므로, double형에 그 값을 넣을 수 있다.
		double exam = 10/3;
		System.out.println(exam);

	}
}
