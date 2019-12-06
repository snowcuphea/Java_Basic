package test.exam;
public class TypeCastingTest
{
	public static void main(String[] args){
		//기본형에서 형변환
		// 자동형변환(큰 데이터타입의 변수 = 작은 데이터타입 변수) 타입이 달라도 더 큰 변수에 담긴다.
		byte b1 = 10;
		short s = b1;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println(d);
		
		char c = 'A';
		//A의 ascii값을 사용하고 싶은 경우
		int data = c; // int = char : 자동형변환
		System.out.println(data);

		//명시적 형변환******************************
		//기본형에서 명시적 형변환
		byte bytedata = (byte)200; //값이 넘쳐서 int리터럴을 byte로 명시적형변환
		//가능하나 의미없는 예시
		System.out.println(bytedata);

		int intdata = 112;
		char chardata = (char)intdata;//int데이터를 char데이터로 변환
		System.out.println(chardata);
		System.out.println((char)115);//115를 char로 명시적캐스팅

		double doubledata = (double)20/100*100; //int연산을 double연산으로 캐스팅
		System.out.println(doubledata);


	}
}