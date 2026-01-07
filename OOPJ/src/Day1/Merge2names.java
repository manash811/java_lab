package Day1;/* Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name
Input:  Enter first name: KIIT
        Enter Second Name: UNIVERSITY
Output:  UNIVERSITY KIIT*/

import java.util.Scanner;
public class Merge2names {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name: ");
        String name1 = sc.next();

        System.out.println("Enter last name: ");
        String name2 = sc.next();

        System.out.println(name1+" "+name2);


    }
}
