package problem_02;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Circle(4);
        Shape shape1 = new Rectangle(13, 27);

        printShape(shape);
        printShape(shape1);


    }
    private static void printShape(Shape shape){
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
    }
}
