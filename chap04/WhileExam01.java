package chap04;

public class WhileExam01 {

	public static void main(String[] args) {
		int sum = 0;
		int odd = 0;
		int even = 0;
		int i = 1;
		while(i<=100) {
			
			if((i%2)==0) {
				even = even + i;
			}else {
				odd = odd + i;
			}
			sum = sum+i;
			i++;
		}
		System.out.println("���� : "+sum);
		System.out.println("¦���� : "+even);
		System.out.println("Ȧ���� : "+odd);
		

	}

}
