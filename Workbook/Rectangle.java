package Workbook;

public class Rectangle extends Shape implements Movable {

	@Override
	public void move(int x, int y) {
		setX(getX()+x);
		setY(getY()+y);
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
