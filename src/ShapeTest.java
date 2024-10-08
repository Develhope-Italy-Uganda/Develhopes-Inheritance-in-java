 // Testing class for the Shape class
    public class ShapeTest {
        public static void main(String[] args) {

            // Create 5 Shape objects using different constructors

            // Using the no-parameter constructor
            Shape shape1 = new Shape();
            String details1 = shape1.getShapeDetails();

            // Using the circle constructor
            Shape shape2 = new Shape(5,0); // Circle with radius 5.0
            String details2 = shape2.getShapeDetails();

            // Using the square constructor
            Shape shape3 = new Shape(4, 10.0); // Square with 4 edges, edge length 10.0
            String details3 = shape3.getShapeDetails().toString();

            // Using the rectangle constructor
            Shape shape4 = new Shape(4, 8.0, 12.0); // Rectangle with 4 edges, lengths 8.0 and 12.0
            String details4 = shape4.getShapeDetails().toString();

            // Using the triangle constructor
            Shape shape5 = new Shape(3, 3.0, 4.0, 5.0); // Triangle with 3 edges, lengths 3.0, 4.0, 5.0
            String details5 = shape5.getShapeDetails().toString();

            // Print the details for each Shape object
            System.out.println(details1);
            System.out.println(details2);
            System.out.println(details3);
            System.out.println(details4);
            System.out.println(details5);
        }
    }


