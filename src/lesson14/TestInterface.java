package lesson14;

public class TestInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Point point1 = new Point(2,2);
		Point point2 = new Point(2,5);
		Point point3 = new Point(7,2);
		Shapeable triangle = new Triangle(point1, point2, point3);
		Shapeable triangle1 = new Triangle(point1, point2, point3);
		Shapeable rectangle = new Rectangle(point1, point2, point3);
		Shapeable square = new Square(point1, point2, point3);
		Shapeable circle = new Circle(point1, point2);
		
		/*System.out.println("Triangle perimeter is - " + triangle.getPerim());
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

       Shapeable[] shapes = new Shapeable[] {
				new Triangle(point1, point2, point3),
				new Rectangle(point1, point2, point3),
				new Square(point1, point2, point3),
				new Circle(point1, point2)};
		
		for (Shapeable sh : shapes) {
			
			System.out.println("Perimeter: " + sh.getPerim());
			System.out.println("Square: " + String.format("%4.3f", sh.getSquare()));
		}
		System.out.println(triangle.equals(triangle1));
	}

}
