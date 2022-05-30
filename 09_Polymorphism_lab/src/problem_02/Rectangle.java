package problem_02;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}
