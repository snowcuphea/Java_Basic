package Workbook;


public class Workbook_p077_07 {

	public static void main(String[] args) {
		
		Car[] cc = new Car[2];
		cc[0] = new L3("L3", "1500", 50, 25, 0);
		cc[1] = new L5("L5", "2000", 75, 35, 0);
		
		Car.print();
		
		for(int i = 0; i<cc.length;i++) {
			if(cc[i] instanceof L3) {
				System.out.println(cc[i].getName()+"\t\t"+cc[i].enginesize+"\t\t"+cc[i].oilTank+"\t\t"
						+cc[i].oilSize+"\t\t"+cc[i].getDistance()+"\t\t"+((L3)cc[i]).getTempGage());
			}else if(cc[i] instanceof L5) {
				System.out.println(cc[i].getName()+"\t\t"+cc[i].enginesize+"\t\t"+cc[i].oilTank+"\t\t"
						+cc[i].oilSize+"\t\t"+cc[i].getDistance()+"\t\t"+((L5)cc[i]).getTempGage());
			}
		}
		System.out.println();
		
		for(int i= 0; i<cc.length;i++) {
			cc[i].setOil(25);
		}
		
		System.out.println("25 주유");
		Car.print();
		for(int i = 0; i<cc.length;i++) {
			if(cc[i] instanceof L3) {
				System.out.println(cc[i].getName()+"\t\t"+cc[i].enginesize+"\t\t"+cc[i].oilTank+"\t\t"
						+cc[i].oilSize+"\t\t"+cc[i].getDistance()+"\t\t"+((L3)cc[i]).getTempGage());
			}else if(cc[i] instanceof L5) {
				System.out.println(cc[i].getName()+"\t\t"+cc[i].enginesize+"\t\t"+cc[i].oilTank+"\t\t"
						+cc[i].oilSize+"\t\t"+cc[i].getDistance()+"\t\t"+((L5)cc[i]).getTempGage());
			}
			
		}
		System.out.println();
		
		for(int i= 0; i<cc.length;i++) {
			cc[i].go(80);
		}
		
		System.out.println("80 주행");
		Car.print();
		for(int i = 0; i<cc.length;i++) {
			if(cc[i] instanceof L3) {
				System.out.println(cc[i].getName()+"\t\t"+cc[i].enginesize+"\t\t"+cc[i].oilTank+"\t\t"
						+cc[i].oilSize+"\t\t"+cc[i].getDistance()+"\t\t"+((L3)cc[i]).getTempGage());
			}else if(cc[i] instanceof L5) {
				System.out.println(cc[i].getName()+"\t\t"+cc[i].enginesize+"\t\t"+cc[i].oilTank+"\t\t"
						+cc[i].oilSize+"\t\t"+cc[i].getDistance()+"\t\t"+((L5)cc[i]).getTempGage());
			}
			
		}
	
		


	}

}
