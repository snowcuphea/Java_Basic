package chap03;
//�⺻���� ������ ������ ��
public class VariableTest {

	public static void main(String[] args) {
		//�⺻�� ����
		int i = 10;
		int j = 10;
		System.out.println("==============�⺻��==============");
		if(i==j){
			System.out.println("�⺻�� ����.");
		}else {
			System.out.println("�⺻�� �ٸ���.");
		}
		//������ ���� : heap�� �Ҵ�� ��ü�� �ּҰ��� �����ִ� ������. 
		System.out.println("==============������===============");
		String str1 = new String("java");
		String str2 = new String("java");
		//str1 = str2; str2���� str1�� ����Ǿ� str1�� str2�� ����Ű�� ���� ����. 
		if(str1==str2) {//���� heap�� �Ҵ�� ��ü���ּҰ��� �����ֱ� ������ �ٸ���. 
			System.out.println("������ ����.");
		}else {
			System.out.println("������ �ٸ���.");
		}
		
		//���ڿ� �� - StringŬ���� �޼ҵ�� ó��
		if(str1.equals(str2)) {
			System.out.println("���ڿ� ����.");
		}
		else {
			System.out.println("���ڿ� �ٸ���.");
		}
		
		boolean result = str1.equals(str2); //boolean�� 0 1 �� �ִ�.
		// if���� result�� �ٷ� str1.equals(str2) �ᵵ �ȴ�. 
		if(result == true) {
			System.out.println("���ڿ� ����.");
		}
		else {
			System.out.println("���ڿ� �ٸ���.");
		}
	}

}
