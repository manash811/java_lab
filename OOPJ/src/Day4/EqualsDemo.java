package Day4;
//3. Using the equals method , demonstrate via a program how to compare 2 students for equality.

class Student1  {
    int rollNo;
    String name;

    // Constructor
    Student1(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {

        // Check reference
        if (this == obj)
            return true;

        // Check null and class type
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        // Type casting
        Student1 s = (Student1) obj;

        // Logical comparison
        return this.rollNo == s.rollNo &&
                this.name.equals(s.name);
    }
}
public class EqualsDemo {
    public static void main(String[] args) {

        Student1 s1 = new Student1(101, "Manash");
        Student1 s2 = new Student1(101, "Manash");

        if (s1.equals(s2)) {
            System.out.println("Both students are equal");
        } else {
            System.out.println("Students are not equal");
        }
    }
}
