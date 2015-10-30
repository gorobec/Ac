package lesson13a;

public class Circle extends Shape{

	public Circle(Point point1, Point point2) {
		super(point1, point2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPerim() {
		int radius = line(getPoint1(), getPoint2());
		
		
		
		return (int)(2* Math.PI * radius);
	}

	@Override
    public double getSquare() {
	int radius = line(getPoint1(), getPoint2());
		
		
		
		return (int)(2* Math.PI * Math.pow(radius, 2));
	}
	
	

}
