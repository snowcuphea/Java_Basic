package oop.chap07;


public class DessertTest {
	public static void main(String[] args){
		Dessert coffee = new Dessert("�Ƹ޸�ī��",4500,5);
		Dessert tea = new Dessert("���Ƽ",3800,1);
		IceCream ice = new IceCream("���Ѹ�", 5000, 2, 310);
		
		System.out.println("*****�� �� �� ǥ ***** ");
		Dessert.print(); //Ŭ�����̸����� �׼���(static) �����ǰ��� �ƴ϶� static���� ȣ��. �Ź�������
		coffee.printProductInfo(); //��ü���������� �׼���(non-static) ������� ���ľ��ؼ� ��ü�ξ׼���. �Ź��ٸ���
		System.out.println();
		tea.printProductInfo();
		System.out.println();
		
		IceCream.print();//���ϰ� ����
		ice.printProductInfo(); //���ϰ� ����
		
		int sum = coffee.getTotalPrice() //���ϰ�����. ������ ���������ϱ�
				  + tea.getTotalPrice()//���ϰ�����. ������ ���������ϱ�
				  + ice.getTotalPrice();//���ϰ�����. ������ ���������ϱ�
		
		System.out.println();
		System.out.println("*** �ѱݾ� " + sum + "�� ***");
		
	}
}
