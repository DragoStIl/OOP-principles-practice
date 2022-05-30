package problem_01_ClassBox;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;

    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;

    }

    public double calculateSurfaceArea() {
        // 2lh + 2wh
        return 2 * (this.width * this.length + this.length * this. height + this. height * this. width);
    }

    public double calculateLateralSurfaceArea() {
        // 2lw + 2lh + 2wh
        return 2 * ((this.length * this.height) + (this.width * this.height));

    }

    public double calculateVolume() {
        return this.width * this.length * this.height;
    }

}
