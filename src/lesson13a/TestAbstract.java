package lesson13a;

public class TestAbstract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Point point1 = new Point(2,2);
		Point point2 = new Point(2,5);
		Point point3 = new Point(7,2);
		/*Shape triangle = new Triangle(point1, point2, point3);
		Shape rectangle = new Rectangle(point1, point2, point3);
		Shape square = new Square(point1, point2, point3);
		Shape circle = new Circle(point1, point2);
		
		System.out.println("Triangle perimeter is - " + triangle.getPerim());
		System.out.println("Triangle square is - " + triangle.getSquare());
		System.out.println("********************");
		
		System.out.println("Rectangle perimeter is - " + rectangle.getPerim());
		System.out.println("Rectangle square is - " + rectangle.getSquare());
		System.out.println("********************");
		
		System.out.println("Square perimeter is - " + square.getPerim());
		System.out.println("Square square is - " + square.getSquare());
		System.out.println("********************");
		
		System.out.println("Circle perimeter is - " + circle.getPerim());
		System.out.println("Circle square is - " + circle.getSquare());*/
		
		Shape[] shapes = new Shape[] {
				new Triangle(point1, point2, point3),
				new Rectangle(point1, point2, point3),
				new Square(point1, point2, point3),
				new Circle(point1, point2)};
		
		for (Shape sh : shapes) {
			
			System.out.println("Perimeter: " + sh.getPerim());
			System.out.println("Square: " + String.format("%4.2f", sh.getSquare()));
		}
	}

}
