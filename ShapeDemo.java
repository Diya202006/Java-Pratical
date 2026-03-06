abstract class Shape {
    double dim1, dim2;

    Shape(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract void area();
}

class Rectangle extends Shape {

    Rectangle(double a, double b) {
        super(a, b);
    }

    void area() {
        double result = dim1 * dim2;
        System.out.println("Area of Rectangle = " + result);
    }
}

class Triangle extends Shape {

    Triangle(double a, double b) {
        super(a, b);
    }

    void area() {
        double result = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle = " + result);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(8, 4);

        r.area();
        t.area();
    }
}