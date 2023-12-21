package HW;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double calculateArea() {
        return length * width;
    }

    @Override
    public Double calculatePerimeter() {
        return length * 2 + width * 2;
    }
}
