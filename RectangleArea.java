import java.util.Scanner;

class Area{
    private double length;
    private double breadth;

  public Area(double length, double breadth){
    this.length = length;
    this.breadth = breadth;
  }

  public void setDim(double length, double breadth){
    this.length = length;
    this.breadth = breadth;
}

  public double getArea(){
    return length*breadth;
  }
}

public class RectangleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Area rect = new Area(length, breadth);

        System.out.println("Area of Rectangle = " + rect.getArea());

        sc.close();

    }
}