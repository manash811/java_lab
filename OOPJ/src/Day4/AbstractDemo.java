package Day4;

//2. Illustrate the usage of abstract class with following Java classes –
//l  An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract method course()
//l A subclass ‘kiitian’ with course() method implementation
//Write the driver class to print the all details of a kiitian object.
//
//Input - Rollno - 2205180
//Registration no - 1234567890
//Output -Rollno - 2205180
//Registration no - 1234567890
//Course - B.Tech. (Computer Science & Engg)
abstract class Student {
    int rollNo;
    long regNo;

    // Method to get input
    void getInput(int rollNo, long regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    // Abstract method
    abstract void course();
}
class Kiitian extends Student {

    // Implementation of abstract method
    @Override
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    // Method to display details
    void display() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course();
    }
}
public class AbstractDemo {
    public static void main(String[] args) {

        Kiitian k = new Kiitian();

        // Input
        k.getInput(2205180, 1234567890L);

        // Output
        k.display();
    }
}

