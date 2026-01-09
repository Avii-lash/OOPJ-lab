package LAB_3;

// Base class
class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}

// Derived class
class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show() method");
    }
}

// Derived class
class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}

// Main class
public class DynamicDispatch {
    public static void main(String[] args) {

        Apple ref;   // Base class reference

        // Object of Apple
        ref = new Apple();
        ref.show();

        // Object of Banana
        ref = new Banana();
        ref.show();

        // Object of Cherry
        ref = new Cherry();
        ref.show();
    }
}
