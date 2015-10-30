package lesson13a;

public class Rectangle extends Shape{
	private Point point3;

	public Rectangle(Point point1, Point point2, Point point3) {
		super(point1, point2);
		this.point3 = point3;
		
	}
	@Override
	public int getPerim() {
		int line1 = line(getPoint1(), getPoint2());
		int line2 = line(getPoint1(), point3);
		
		
		return (line1 + line2) * 2;
	}

	@Override
	public double getSquare() {
		int line1 = line(getPoint1(), getPoint2());
		int line2 = line(getPoint1(), point3);
		
		
		return line1 * line2;
	}

}
