package lesson13a;

abstract class Shape {
	
	private Point point1;
	private Point point2;
	public Shape(Point point1, Point point2) {
		super();
		this.point1 = point1;
		this.point2 = point2;
	}
	
	
	public Point getPoint1() {
		return point1;
	}


	public Point getPoint2() {
		return point2;
	}


	public int line (Point point1, Point point2) {
		
		return (int)(Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + (Math.pow(point2.getY() - point1.getY(), 2))));
		
		
	}
	abstract int getPerim();
	abstract double getSquare();
	
	
}
