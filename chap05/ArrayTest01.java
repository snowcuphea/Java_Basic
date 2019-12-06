package chap05;
//배열의 문법 연숩 - 사용하는 방법
public class ArrayTest01 {
	public static void main(String[] args) {
		//1. 배열의 선언
		int[] myarr;
		int[] myarr2;
		//2. 배열의 생성
		myarr = new int[5]; //heap에 할당해야 하니까 new를 쓴다. 사이즈는 5개 변수를 저장할 공간
		myarr2 = new int[5];
		System.out.println(myarr); // heap의 어느 위치에 있는지 주소값이 나온다. 
		System.out.println(myarr2);
		System.out.println("myarr의 2번 요소의 값=> " +myarr[2]);//초기값이 0임을 알 수 있다.
		
		//3.배열의 초기화 - 2번 요소에 100을 저장
		myarr[2] = 100;
		System.out.println("myarr의 2번 요소의 값=> " +myarr[2]);
		
		//배열의 선언과 생성을 한꺼번에 처리
		int[] numarray = new int[3];
		boolean[] boolArray = new boolean[5];
		long[] longArray = new long[100];
		double[] doublearr = new double[100];
		
		
		//배열의 기본 초기값
		//기본형인 경우
		//정수형 - 0
		//boolean - false
		//실수형 - 0.0
		System.out.println(numarray[0]); //초기값이 0
		System.out.println(boolArray[0]); //초기값이 false이다.
		System.out.println(longArray[0]); //초기값이 0
		System.out.println(doublearr[0]); //초기값이 0.0
		
	}

}
