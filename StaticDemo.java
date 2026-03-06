class StaticDemo {

    static int count;

    static {
        System.out.println("Static block executed.");
        count = 10;
    }

    static void display() {
        System.out.println("Value of static variable count = " + count);
    }

    public static void main(String[] args) {

        System.out.println("Main method executed.");

        display();

        count = 20;

        System.out.println("Updated value of count = " + count);
    }
}