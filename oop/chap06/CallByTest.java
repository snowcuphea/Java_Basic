package oop.chap06;

public class CallByTest {

	public static void main(String[] args) {
		//사용할 기본형변수와 참조형변수의 초기화
		CallByTest obj = new CallByTest();
		
		int i = 100;
		
		int[] myarr = new int[5];
		for (int j = 0; j < myarr.length; j++) {
			myarr[j] = 100;
			
		}
		System.out.println("========change호출전========");
		obj.display(i, myarr);
		obj.change(i, myarr);
		
		System.out.println("========change호출후========");
		obj.display(i, myarr); 
	}
	
	//매개변수로 전달된 num의 값과 myarr가 참조하는 배열의 요소값을 출력하는 메소드
	public void display(int num, int[] myarr) {
		System.out.println("i="+num);
		System.out.println("myarr의 요소값");
		for (int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + "\t");
		}
		System.out.println();
	}
	
	//매개변수로 전달된 i와 myarr가 참조하는 배열의 요소값을 변경하는 메소드
	public void change(int i, int[] myarr) {
		i = 200; // 실제로 출력 결과 i는 변하지 않았다.
		myarr[1] = 200;
	}
	
	//배열을 가리키는 주소값을 넘길 때는 (call by reference) 같은 배열을 지칭하게 되므로
	//값이 공유된다. (값이 변경되면 같이 공유하기때문에 같이 바뀜) Read And Write!!!
	//기본형은 그냥 값만 넘어가는 거다 보니까 상관없다. Read Only
	
	//객체에서 값만 바꾸려면 복제해서 사용하도록 한다. 

}
