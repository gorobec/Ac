package lesson14;

import lesson13a.Point;

public abstract class Shape2 implements Shapeable {
	
	public int line (Point point1, Point point2) {
		
		return (int)(Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + (Math.pow(point2.getY() - point1.getY(), 2))));

	}

	public abstract int getPerim();
	public abstract double getSquare();
}
