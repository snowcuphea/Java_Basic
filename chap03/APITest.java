package chap03; // chap03������ �����ϰ� �̾ȿ� APITest.class�� �����Ѵ�.
// ctrl + shift + o ������ �ڵ����� import ��� ����
//java.io ��Ű���� ��� ���� �νĽ�Ű��
import java.io.File;
import java.util.ArrayList;
import java.util.Random; // RandomŬ������ �νĽ�Ű�� 
//java.lang��Ű���� �⺻���� �ν��ϹǷ� �ٸ� ��Ű���ȿ� �����ϴ� Ŭ������ ����ϴ� ��� 
//� ��Ű���� �մ��� �νĽ�Ű�� �۾��� �ؾ��Ѵ�. 

//1. API���� �����ϴ� Ŭ�������ڹ� ���α׷� �ȿ��� ����ϱ����� �޸𸮿� �ø��� �۾�
// - JVM�� �ν��ϴ� �۾� ������ �Ҵ�
// ���� : �����Ŭ������ ���� = new �����Ŭ������()

public class APITest {
//API ����ϱ� - ������ ���� ����
	public static void main(String[] args) {
//1. API���� �����ϴ� Ŭ������ �ڹ� ���α׷� �ȿ��� ����ϱ� ���� �޸𸮿� �ø��� �۾�
		//new String();//��Ʈ�� Ŭ������ �޸𸮿� �ø����� new�� ����Ѵ�.
		//heap�� ��Ʈ���̶�� Ŭ������ �ö��ֵ�.
		// �Ȱ��� Ÿ������ ������ �����ؼ� �޾��ִ� �۾����� �Ѵ�.(�޾Ƽ� ���� �������� ����ϴϱ�)
		String str = new String();
		StringBuffer sb = new StringBuffer();
		
		//������ ��Ű���� �ڵ����� �ν� ���ؼ� �̷� Ŭ������ ������
		// �ڹ� �������������� �˷�����ϴµ� �� �۾��� import�Դϴ�.
		File file = new File("test.txt");
		
		Random rand = new Random();
		ArrayList list = new ArrayList();
		
//2. ��ü(Ŭ������ ����ϱ����� �޸𸮿� �÷����� ��)�� �޼ҵ� ����ϱ�
// ->�ν��Ͻ� ��� ��
		String str2 = new String("java programming");//� ���ڿ��� ���� ���� ��ȣ �ȿ� ���ش�
		char returnValue = str2.charAt(0);//���ڿ����� �ش� ��ġ�� �ִ� ���� ���ڷ� ��ȯ
		//charAt�� ���� ����� charŸ���̹Ƿ� ���� Ÿ���� ������ �����ؼ� ����
		System.out.println("������->"+returnValue);
		
		//i love you��� ���ڿ��� �̿��ؼ� String��ü�� �����ϰ�
		//�� ���ڿ��� ���̸� ������ ���� �������� ����ϼ���.
		//[�������]
		//���ڿ��� ���� => ___
		String str3 = new String("I love you");
		int leng = str3.length();
		System.out.println("������=>" + leng);
		

	}
}
