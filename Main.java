package HW;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(1);
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(4);

        System.out.println("Периметр круга равен - " + circle.calculatePerimeter());
        System.out.println("Площадь круга равен - " + circle.calculateArea());
        System.out.println("\nПериметр прямоугольника равен - " + rectangle.calculatePerimeter());
        System.out.println("Площадь прямоугольника равен - " + rectangle.calculateArea());
        System.out.println("\nПериметр квадрата равен - " + square.calculatePerimeter());
        System.out.println("Площадь квадрата равен - " + square.calculateArea());
    }
}
