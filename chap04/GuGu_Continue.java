package chap04;
//continue - ����� ��ġ �Ʒ��� �ڵ带 skip�ϱ� ���� ���
public class GuGu_Continue{

	public static void main(String[] args) {
		int i, dan;
		for (dan = 2; dan<10;dan++) {
			if(dan==5) {
				continue; 
			}

			for (i = 1; i<10; i++) {
				
				/*if(dan ==5) { break���̳��� for�� ����Ǿ� �����Ƿ� �ݺ����� ��������� �ʴ´�.
					break;
				}*/
				System.out.print(dan + "*" + i + "=" + dan*i+"\t");
				
			}
			System.out.println("\n");
			
		}

	}

}
