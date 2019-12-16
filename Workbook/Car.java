package Workbook;

public abstract class Car {
	public String name;
	public String enginesize;
	public int oilTank;
	public int oilSize;
	public int distance;
	
	public Car() {
	
	}

	public Car(String name, String enginesize, int oilTank, int oilSize, int distance) {
		super();
		this.name = name;
		this.enginesize = enginesize;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnginesize() {
		return enginesize;
	}

	public void setEnginesize(String enginesize) {
		this.enginesize = enginesize;
	}

	public int getOilTank() {
		return oilTank;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public abstract void go(int distance);
	
	public abstract void setOil(int oilSize);
	
	public static void print() {
		System.out.println("Vehicle Name\t engineSize\t oilTank\t oilSize\t distance\t temperature");
		System.out.println("-------------------------------------------------------------------------------------");
		
	}


}
