package test.exam;
//�ڹ� �⺻�� �������� ���ͷ��� ���ؼ� ���캸�� ����
public class PrimitiveTypeTest{
	public static void main(String[] args){
		//boolean��
		boolean boo = true; //true of false
		System.out.println(boo);
		
		//������
		char c ='a';//charŸ�� ������ ���ͷ��� ǥ���� �� ''�� ǥ��
		System.out.println(c);

		//����������
		//�������������⺻���� �Ҵ�Ǵ� ���ͷ��� Ÿ���� int
		byte b = 127;
		System.out.println(b);

		short s = 32767;
		System.out.println(s);

		int i = 2147483647;
		System.out.println(i);

		long l = 2147483648L;// longŸ�� ������ �ֱ� ������, 
		//���ͷ��� �� ��ü ������ ��Ʈ�� ����.
		//���� L�̳� l�� �� �ڿ� �ٿ��ָ� ��
		System.out.println(l);

		//�Ǽ�
		//�Ǽ��� ���ͷ��� �⺻ Ÿ���� double
		float f = 10.5F; //float = double �� ��� ����.
		//���� ������ ū ���� �ִ� ���� �ȴ�.
		//���� ����������, floatŸ�� ��� �� ���̻� F�� f�� �߰��Ѵ�.
		System.out.println(f);
		double d = 10.5;
		System.out.println(d);

		// ������ ���� 10/3 �ؼ� int�� 3�� ���´�. 
		// �׸��� double�� int�� ���� ũ�Ƿ�, double���� �� ���� ���� �� �ִ�.
		double exam = 10/3;
		System.out.println(exam);

	}
}
