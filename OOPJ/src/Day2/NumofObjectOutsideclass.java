package Day2;/* Program to find no. of objects created out of a class using ‘static’ modifier.
Input:   No of objects created
Output: Display the number of objects created (e.g. no of objects=3) */
import java.util.Scanner;

class ObjectCount {
    static int count = 0;

    // constructor
    ObjectCount() {
        count++;
    }
}

public class NumofObjectOutsideclass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of objects to be created: ");
        int n = sc.nextInt();

        // creating objects
        for (int i = 0; i < n; i++) {
            new ObjectCount();
        }

        // display result
        System.out.println("Number of objects = " + ObjectCount.count);

        sc.close();
    }
}

