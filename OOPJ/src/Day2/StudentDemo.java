package Day2;/*Write a program in java to input and display the details of n number of students having roll,
 name and cgpa as data members. Also display the name of the student having lowest cgpa.
Input:   Enter Roll No, Name and cgpa of ‘n’ number of students.
Output: Display the details of ‘n’ number of students. Also display the name of student with
lowest cgpa*/
import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;


    void read(Scanner sc) {
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No : " + roll);
        System.out.println("Name    : " + name);
        System.out.println("CGPA    : " + cgpa);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        // Create objects and read data
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            s[i] = new Student();
            s[i].read(sc);
        }

        // Display all student details
        System.out.println("\nDay2.Student Details:");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        // Find student with lowest CGPA
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[minIndex].cgpa) {
                minIndex = i;
            }
        }

        // Display student with lowest CGPA
        System.out.println("Day2.Student with lowest CGPA:");
        System.out.println("Name: " + s[minIndex].name);

        sc.close();
    }
}
