package chap04;
//continue - 선언된 위치 아래의 코드를 skip하기 위해 사용
public class GuGu_Continue{

	public static void main(String[] args) {
		int i, dan;
		for (dan = 2; dan<10;dan++) {
			if(dan==5) {
				continue; 
			}

			for (i = 1; i<10; i++) {
				
				/*if(dan ==5) { break문이내부 for에 선언되어 있으므로 반복문이 종료되지는 않는다.
					break;
				}*/
				System.out.print(dan + "*" + i + "=" + dan*i+"\t");
				
			}
			System.out.println("\n");
			
		}

	}

}
