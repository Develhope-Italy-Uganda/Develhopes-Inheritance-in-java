// Define the Shape class
public class Shape {
    // Instance variables
    private String shapeName;
    private int numberOfEdges;

    // Basic constructor (no parameters)
    public Shape() {
        this.shapeName = "Undefined";
        this.numberOfEdges = 0;
        System.out.println("Shape object created with no parameters. Shape is undefined.");
    }

    // Constructor for Circle
    public Shape(double radius) {
        this.shapeName = "Circle";
        this.numberOfEdges = 0; // A circle technically has no edges
        System.out.println("Shape object created: Circle with radius " + radius);
    }

    // Constructor for Square
    public Shape(int edges, double edgeLength) {
        this.shapeName = "Square";
        this.numberOfEdges = edges;
        System.out.println("Shape object created: Square with " + edges + " edges, each edge length " + edgeLength);
    }

    // Constructor for Rectangle
    public Shape(int edges, double e1, double e2) {
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
        System.out.println("Shape object created: Rectangle with " + edges + " edges, lengths " + e1 + " and " + e2);
    }

    // Constructor for Triangle
    public Shape(int edges, double e1, double e2, double e3) {
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
        System.out.println("Shape object created: Triangle with " + edges + " edges, lengths " + e1 + ", " + e2 + ", " + e3);
    }

    // Method to get shape details
    public String getShapeDetails() {
        return "Shape: " + this.shapeName + ", Number of Edges: " + this.numberOfEdges;
    }
}
