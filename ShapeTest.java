 interface Shape {
    void area();
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}

class Triangle implements Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(8, 4);

        r.area();
        t.area();
    }
}