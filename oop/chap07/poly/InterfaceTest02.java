package oop.chap07.poly;

import javax.swing.JFrame;
//�������̽��� ����ϴ� ������ ���߻���� ���, �������� ������ �� �ֵ���,
//			�⺻������ �����ؾ� �ϴ� ����� �������� �����ϱ� ���� ����

class GUITest extends JFrame implements Runnable{
	GUITest(){
	}
	GUITest(String title){
		super(title);
		setSize(500, 500); //�� �޼ҵ���� �θ�Ŭ���� �ȿ� ���ǵǾ��ִ� �޼ҵ���̶� ���پ�������
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ŭ�����̸����� �׼���, �빮��->���� ����� ���
		//������ ����ȴ�.
		
	}
	
}

public class InterfaceTest02 {

	public static void main(String[] args) {
		

	}

}
