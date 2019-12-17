package chap08; 
import java.util.Scanner;
public class Prob1 {
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
		String str= scan.nextLine();
		int result= 0;

		//여기를 작성하십시오. try ~ catch로 예외처리
		
		try {
			result = convert(str);
			System.out.println(result);

			
		}catch(IllegalArgumentException e){
			System.out.println("문자열을 입력하지 않고 Enter키를 누르셨습니다.");
		}//throw했던 익셉션을 적어주거나, 그보다 상위 (예를들면 Exception)클래스를 적어준다. 
		
	}
	
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	private static int convert(String str) throws IllegalArgumentException, ArithmeticException {
		// 선언부에는 밑에 작성한 throw들과 동일하게 적어준다. 여러 개면 다 적어주고 또는 그들을 포함하는 상위클래스 적음
// 하지만 디테일 하게 알려면 디테일하게 넘겨주는게 좋다. 		
		if(str == null || str.length() == 0 ){
			
			throw new IllegalArgumentException(); //걸려야 할 오류
			// 그보다 상위 클래스 써도 되긴 하는데, 그러면 다 걸러져서 디테일하게 뭐가 오류인지 알기 힘들다. 
		}
		
		int cv = Integer.parseInt(str);
		return cv;
	}
}