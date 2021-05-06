import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Shape triangle = new Triangle("Special shape", "iron", 6, 8);
		Shape anotherTriangle = new Triangle("perfection", "silver", 8, 10);
		Shape rectangle = new Rectangle("cube", "gold", 7, 9);
		Shape anotherRectangle = new Rectangle("basic", "copper", 9, 11);
		
		ArrayList<Shape> shapeArray = new ArrayList<Shape>();
		
		shapeArray.add(triangle);
		shapeArray.add(anotherTriangle);
		shapeArray.add(rectangle);
		shapeArray.add(anotherRectangle);
		
		for(Shape shapes: shapeArray) {
			System.out.println(shapes.toString());
			System.out.println(shapes.getSize());
		}
		
		for(Shape shapes: shapeArray) {
			if(shapes instanceof Triangle) {
				Triangle triangleRef = (Triangle) shapes;
				System.out.println(triangleRef.toString());
			}
			else if(shapes instanceof Rectangle) {
				Rectangle rectangleRef = (Rectangle) shapes;
				System.out.println(rectangleRef.toString());
			}
			else{
				System.out.println("No info to be displayed");
			}
		}
	}
}