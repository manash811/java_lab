package Day2;/* Write a program to overload subtract method with various parameters in a class in Java. Write the driver class to use the different subtract methods using object.
Input:  Mention various subtract method having different parameters.
Output: Day2.Subtract method will display the result accordingly*/
// Class with overloaded subtract methods

class Subtract {

    // Day2.Subtract two integers
    void subtract(int a, int b) { System.out.println("Subtraction of two integers = " + (a - b));
    }

    // Day2.Subtract three integers
    void subtract(int a, int b, int c) {
        System.out.println("Subtraction of three integers = " + (a - b - c));
    }

    // Day2.Subtract two double values
    void subtract(double a, double b) {
        System.out.println("Subtraction of two doubles = " + (a - b));
    }
}

// Driver class
public class SubtractDemo {
    public static void main(String[] args) {

        Subtract s = new Subtract();  // object creation

        // Calling overloaded methods
        s.subtract(10, 5);
        s.subtract(20, 5, 3);
        s.subtract(15.5, 4.2);
    }
}

