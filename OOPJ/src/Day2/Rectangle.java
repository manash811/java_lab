package Day2;/* Write a program in Java to create a class Day2.Rectangle having data members length and breadth and three methods called read, calculate and display to read the values of length and breadth,  calculate the area and perimeter of the rectangle and display the result   respectively.
Create a class named 'Day2.Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize length
and breadth of the rectangle.
Create a class named 'Day2.Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize length
and breadth of the rectangle.
    Input:   Mention length and breadth
Output: Display Area of Day2.Rectangle and Perimeter of rectangle.*/
import java.util.Scanner;

class DemoRectangle {

    double length, breadth;
    double area, perimeter;

    // Constructor to initialize length and breadth
   DemoRectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area and perimeter
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    // Method to display result
    void display() {
        System.out.println("Area of Day2.Rectangle = " + area);
        System.out.println("Perimeter of Day2.Rectangle = " + perimeter);
    }
}

public class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        // Creating object using constructor
        DemoRectangle r = new DemoRectangle(length, breadth);

        r.calculate();
        r.display();

        sc.close();
    }
}

