public class Swap {
  public static void main(String[] args){
    int a=2, b=3;
    System.out.println("The Before Swapping a is: " + a);
    System.out.println("The Before Swapping b is: " + b);
    
    int temp=a;
    a=b;
    b=temp;

    System.out.println("The After Swapping a is: " + a);
    System.out.println("The After Swapping b is: " + b);
    
  }
}