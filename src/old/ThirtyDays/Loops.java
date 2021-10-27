package old.ThirtyDays;

import java.util.Scanner;

public class Loops {
    private static Scanner scanner = new Scanner(System.in);

    public static void Multiples(){
        System.out.println("Enter a number to get multiples up to 10:");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            int result = i * n;
            System.out.println(n + " x " + i + " = " + result);
        }

    }
}
