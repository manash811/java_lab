package Day2;/*Write a program in java using constructor overloading concept
to calculate the area of a rectangle having data member as length and breadth. Use default constructor
to initialize the value of the data member to zero and parameterized constructor to initialize the
value of data member according to the user input.
Input: Mention the value of length and breadth
Output: Display the area of rectangle accordingly.*/

import java.util.Scanner;

class Rectangle2{

    double length, breadth;

    // Default constructor
    Rectangle2() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Rectangle2(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    double area() {
        return length * breadth;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Rectangle2 r1 = new Rectangle2();
        System.out.println("Area using default constructor = " + r1.area());

        // User input
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        // Using parameterized constructor
        Rectangle2 r2 = new Rectangle2(length, breadth);
        System.out.println("Area of rectangle = " + r2.area());

        sc.close();
    }
}

