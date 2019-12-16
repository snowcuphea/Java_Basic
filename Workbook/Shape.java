package Workbook;

public abstract class Shape extends Point {
	
	protected Point point;
	
	public Shape() {
		
	}
	
	public Shape(Point point) {
		super(point);
	}

	
	
	
	public abstract double getArea();
	
	public abstract double getCircumference();
	

}
