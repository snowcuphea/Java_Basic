package chap04;

public class ForExam03 {
	public static void main(String[] args) {
		int sum = 0;
		int odd = 0;
		int even = 0;

		
		for ( int i=1 ; i<101 ; i=i+1) {
			
			if((i%2)==0) {
				even = even+i;
				
			}else {
				odd = odd+i;
			}
			sum = sum+i;
			
		}
		
		System.out.println("[�������]");
		System.out.println("��: "+sum);
		System.out.println("Ȧ����: "+odd);
		System.out.println("¦����: "+even);

	}

}
