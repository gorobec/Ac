package lesson14;



public class Rectangle implements Shapeable {
	
	private Point point1;
	private Point point2;
	private Point point3;
	
	
	public Rectangle(Point point1, Point point2, Point point3) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}


	public Point getPoint1() {
		return point1;
	}


	public Point getPoint2() {
		return point2;
	}
	
	private int line (Point point1, Point point2) {
		
		return (int)(Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + (Math.pow(point2.getY() - point1.getY(), 2))));

		}

	public Point getPoint3() {
		return point3;
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
