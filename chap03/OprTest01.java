package chap03;

public class OprTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		
		x = 5;
		y = x++;
		System.out.println("x�ǰ�=>"+x);
		System.out.println("y�ǰ�=>"+y);
		System.out.println("=============================");
		
		x = 5;
		y = ++x;
		System.out.println("x�ǰ�=>"+x);
		System.out.println("y�ǰ�=>"+y);
		System.out.println("=============================");
		
		x = 5;
		y = x--;
		System.out.println("x�ǰ�=>"+x);
		System.out.println("y�ǰ�=>"+y);
		System.out.println("=============================");
		
		x = 5;
		y = --x;
		System.out.println("x�ǰ�=>"+x);
		System.out.println("y�ǰ�=>"+y);
		System.out.println("=============================");
	}

}
