package lesson14;



public class Circle implements Shapeable {
	
	private Point point1;
	private Point point2;
	
	
	public Circle(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
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
