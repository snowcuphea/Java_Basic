package chap08; 
import java.util.Scanner;
public class Prob1 {
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("���ڷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		String str= scan.nextLine();
		int result= 0;

		//���⸦ �ۼ��Ͻʽÿ�. try ~ catch�� ����ó��
		
		try {
			result = convert(str);
			System.out.println(result);

			
		}catch(IllegalArgumentException e){
			System.out.println("���ڿ��� �Է����� �ʰ� EnterŰ�� �����̽��ϴ�.");
		}//throw�ߴ� �ͼ����� �����ְų�, �׺��� ���� (������� Exception)Ŭ������ �����ش�. 
		
	}
	
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	private static int convert(String str) throws IllegalArgumentException, ArithmeticException {
		// ����ο��� �ؿ� �ۼ��� throw��� �����ϰ� �����ش�. ���� ���� �� �����ְ� �Ǵ� �׵��� �����ϴ� ����Ŭ���� ����
// ������ ������ �ϰ� �˷��� �������ϰ� �Ѱ��ִ°� ����. 		
		if(str == null || str.length() == 0 ){
			
			throw new IllegalArgumentException(); //�ɷ��� �� ����
			// �׺��� ���� Ŭ���� �ᵵ �Ǳ� �ϴµ�, �׷��� �� �ɷ����� �������ϰ� ���� �������� �˱� �����. 
		}
		
		int cv = Integer.parseInt(str);
		return cv;
	}
}