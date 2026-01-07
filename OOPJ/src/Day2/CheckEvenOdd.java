package Day2;/*Accept 10 numbers from command line and check how many of them are even and how many are odd.
        Input: Enter 10 number from keyboard
Output:  Display number of even and odd number*/
import java.util.Scanner;
public class CheckEvenOdd {
    public static void main(String[] args){

        int EvenNumbers = 0;
        int OddNumbers = 0;

        for(int i=0; i< args.length; i++) {
            int num = Integer.parseInt(args[i]);


            if (num % 2 == 0)
                EvenNumbers++;
            else
                OddNumbers++;
        }
        System.out.println("Count of Even Numbers: "+EvenNumbers);
        System.out.println("Count of Odd Numbers: "+OddNumbers);

    }
}
