package test.exam;

import oop.chap06.Person;

//�⺻���� �ν��ϴ� ��Ű���� ��ġ�� java.lang ��Ű���� ���� �۾� ��Ű��
//�ٸ� ��Ű���� �ִ� Ŭ������ ����ϴ� ��쿡�� API�� ���� �ۼ��� Ŭ������ ��� import ����� �Ѵ�.
public class PublicTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "�嵿��";
		p1.addr ="����� "; //default�̹Ƿ� �ܺ� ��Ű������ ������ �� ����
		p1.age = 45; //private�̹Ƿ� �ܺ� ��Ű��, �ܺ� Ŭ���� ��� ������ �� ����.
	}

}
