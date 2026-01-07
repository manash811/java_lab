package Day1;/* Program to check a user entered number is palindrome or not
Input:  Mention the number in the program
Output: display the number is Palindrome or not.
 */
import java.util.Scanner;

public class Palindromecheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is not a Palindrome number");
        }

    }
}

