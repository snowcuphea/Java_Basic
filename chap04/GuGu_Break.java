package chap04;
//break�� ���� - break���� ����� ���� ����������.
public class GuGu_Break{

	public static void main(String[] args) {
		int i, dan;
		for (dan = 2; dan<10;dan++) {
			if(dan==5) {
				break;
			}

			for (i = 1; i<10; i++) {
				
				/*if(dan ==5) {
					break;
				}*/
				System.out.print(dan + "*" + i + "=" + dan*i+"\t");
				
			}
			System.out.println("\n");
			
		}

	}

}
