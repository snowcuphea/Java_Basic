package chap04;

public class SwitchTest03 {
	public static void main(String[] args) {
		//switch의 조건문은 int로 casting될 수 있는 값을 담고있는 변수, 연산식, 메소도호출문
		double d = 1.5;
		/*switch(d) {
		case 1.0:	
		}
*/
		int data = 5;
		switch(data+60) {
			case 'A' :
				System.out.println("A");
				break;
			case 'B' : 
				System.out.println("B");
				break;		
		}
		
		//string도 가능
		String code = new String("a01");
		switch(code) {
			case "a01" :
				System.out.println("A01");
				break;
			case "a02":
				System.out.println("A02");
		
		
		}
	
	
	}

}
