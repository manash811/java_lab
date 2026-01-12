package Day3;

import java.util.Scanner;

// 2D class
class Plastic2D {
    double length, width;
    final double costPerSqFt = 40;

    void get2DInput(double l, double w) {
        length = l;
        width = w;
    }

    double calculate2DCost() {
        double area = length * width;
        return area * costPerSqFt;
    }
}

// 3D class inherits from 2D
class Plastic3D extends Plastic2D {
    double height;
    final double costPerCuFt = 60;

    void get3DInput(double l, double w, double h) {
        get2DInput(l, w);
        height = h;
    }

    double calculate3DCost() {
        double volume = length * width * height;
        return volume * costPerCuFt;
    }
}

// Driver class
public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Plastic Type:");
        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        int choice = sc.nextInt();

        if (choice == 1) {
            Plastic2D sheet = new Plastic2D();
            System.out.print("Enter length (ft): ");
            double l = sc.nextDouble();
            System.out.print("Enter width (ft): ");
            double w = sc.nextDouble();

            sheet.get2DInput(l, w);
            System.out.println("Cost of 2D Plastic Sheet = Rs " + sheet.calculate2DCost());
        }
        else if (choice == 2) {
            Plastic3D box = new Plastic3D();
            System.out.print("Enter length (ft): ");
            double l = sc.nextDouble();
            System.out.print("Enter width (ft): ");
            double w = sc.nextDouble();
            System.out.print("Enter height (ft): ");
            double h = sc.nextDouble();

            box.get3DInput(l, w, h);
            System.out.println("Cost of 3D Plastic Box = Rs " + box.calculate3DCost());
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
