package test.exam;
public class TypeCastingTest
{
	public static void main(String[] args){
		//�⺻������ ����ȯ
		// �ڵ�����ȯ(ū ������Ÿ���� ���� = ���� ������Ÿ�� ����) Ÿ���� �޶� �� ū ������ ����.
		byte b1 = 10;
		short s = b1;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println(d);
		
		char c = 'A';
		//A�� ascii���� ����ϰ� ���� ���
		int data = c; // int = char : �ڵ�����ȯ
		System.out.println(data);

		//����� ����ȯ******************************
		//�⺻������ ����� ����ȯ
		byte bytedata = (byte)200; //���� ���ļ� int���ͷ��� byte�� ���������ȯ
		//�����ϳ� �ǹ̾��� ����
		System.out.println(bytedata);

		int intdata = 112;
		char chardata = (char)intdata;//int�����͸� char�����ͷ� ��ȯ
		System.out.println(chardata);
		System.out.println((char)115);//115�� char�� �����ĳ����

		double doubledata = (double)20/100*100; //int������ double�������� ĳ����
		System.out.println(doubledata);


	}
}