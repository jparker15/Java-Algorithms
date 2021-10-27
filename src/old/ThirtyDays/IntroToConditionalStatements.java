package old.ThirtyDays;
import java.util.Scanner;
//TODO:Given an integer,perform the following conditional actions:If  is odd, print Weird
// If is even and in the inclusive range of to print Not Weird
// If is even and in the inclusive range of toprint Weird
// If is even and greater than print Not Weird
// Complete the stub code provided in your editor to print whether or not is weird.

public class IntroToConditionalStatements {
    static Scanner scanner = new Scanner(System.in);

    public static void Conditionals (){
        int N = scanner.nextInt();

        if (N % 2 != 0){
            System.out.println("Weird");
        }
        if(N % 2 == 0 && N >= 2 && N <= 5){
            System.out.println("Not Weird");
        }
        if(N % 2 == 0 && N >= 6 && N <= 20){
            System.out.println("Weird");
        }
        if (N % 2 == 0 && N > 20){
            System.out.println("Not Weird");
        }

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    }
}
