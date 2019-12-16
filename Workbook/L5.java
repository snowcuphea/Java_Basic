package Workbook;

public class L5 extends Car implements Temp {
	
	public L5() {
		
	}


	public L5(String name, String enginesize, int oilTank, int oilSize, int distance) {
		super(name, enginesize, oilTank, oilSize, distance);
		
	}


	@Override
	public void go(int distance) {
		setOilSize(getOilSize()- distance/8);
		setDistance(distance);


	}

	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);

	}
	
	@Override
	public int getTempGage() {
		int temp = 0;
		temp = temp + 2*(getDistance()/10);
		
		return temp;
	}

}
