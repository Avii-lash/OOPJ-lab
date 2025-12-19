package LAB_2;

     class q6{

    // subtract two integers
    void subtract(int a, int b) {
        System.out.println("Subtraction of two integers: " + (a - b));
    }

    // subtract three integers
    void subtract(int a, int b, int c) {
        System.out.println("Subtraction of three integers: " + (a - b - c));
    }

    // subtract two double values
    void subtract(double a, double b) {
        System.out.println("Subtraction of two doubles: " + (a - b));
    }


    public static void main(String[] args) {

        q6 obj = new q6();

        // calling overloaded methods
        obj.subtract(20, 10);
        obj.subtract(50, 20, 10);
        obj.subtract(25.5, 10.2);
    }
}
