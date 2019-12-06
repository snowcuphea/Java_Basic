package chap04;

public class GuGu {

	public static void main(String[] args) {
		int i, dan;
		for (dan = 2; dan<10;dan++) {
			System.out.println("< "+dan + " ´Ü >");
			for (i = 1; i<10; i++) {
				System.out.print(dan + "*" + i + "=" + dan*i+"\t");
				
			}
			System.out.println("\n");
			
		}

	}

}
