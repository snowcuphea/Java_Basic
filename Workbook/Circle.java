package Workbook;

public class Circle extends Shape implements Movable {

	@Override
	public void move(int x, int y) {
		setX(getX()+x);
		setY(getY()+y);
	}

	@Override
	public double getArea() {
		
		return 0;
	}

	@Override
	public double getCircumference() {
		
		return 0;
	}
	

}
