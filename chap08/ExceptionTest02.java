package chap08;
//try~~catch로 예외를 처리 
public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			System.out.println("*******프로그램시작*******");
			System.out.println(10/0); //예외가 발생할 수 있는 문장
			System.out.println("*******프로그램종료*******");
			
		}catch(ArithmeticException e) { //힙에 할당된 익셉션 객체가 e로 주소저장
			System.out.println("오류발생....");
			System.out.println("예외메세지 :" + e.getMessage());
			e.printStackTrace(); //void메소드 , 오류 추적 기능 
			
		}
		
	}

}
