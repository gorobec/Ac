package lesson14;



public class Triangle implements Shapeable {
	
	private Point point1;
	private Point point2;
	private Point point3;
	
	public Triangle(Point point1, Point point2, Point point3) {
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

	public Point getPoint3() {
		return point3;
	}
	private int line (Point point1, Point point2) {
			
		return (int)(Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + (Math.pow(point2.getY() - point1.getY(), 2))));

		}

	@Override
	public int getPerim() {
		int line1 = line(getPoint1(), getPoint2());
		int line2 = line(getPoint1(), point3);
		int line3 = line(getPoint2(), point3);
		
		return line1 + line2 + line3;
	}

	@Override
	public double getSquare() {
		int line1 = line(getPoint1(), getPoint2());
		int line2 = line(getPoint1(), point3);
		int line3 = line(getPoint2(), point3);
		
		return line1 * line2 * line3 / 2;
	}
	
	

}
