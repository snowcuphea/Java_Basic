package chap05;

import java.util.Random;
import java.util.Scanner;

//참조형 데이터 배열 만들기
public class ArrayTest02 {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		Random[] randArr = new Random[5];
		Scanner[] keyArr = new Scanner[100];
		
		//참조형 배열변수의 초기값은 null
		//null은 아무것도 참조하지 않는다.
		System.out.println(strArr[0]);
		System.out.println(randArr[0]);
		System.out.println(keyArr[0]);
		//기본형 데이터는 값을 직접 저장한다. 하지만 참조형 변수는 heap에 할당된 객체의 주소를 저장
		//null이라고 나온 것은 각각 요소에 어떤 객체를 참조할 지 정해주지 않아서 나오는 것이다.
		
		//참조형 배열의 선언과 생성과 초기화
		String[] arr = new String[3];
		arr[0] = new String("java");
		arr[1] = new String("JDBC");
		arr[2] = new String("HTML5");
		
		System.out.println(arr[1]);
		

	}

}
