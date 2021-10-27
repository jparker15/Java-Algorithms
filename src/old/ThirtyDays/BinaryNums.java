package old.ThirtyDays;

import java.util.Scanner;

public  class BinaryNums {
    static Scanner scanner = new Scanner(System.in);
    public static void BinaryNums ()
    {
        System.out.println("Enter a integer to find it's binary equivalent ");
        int n = scanner.nextInt();
        System.out.println("Binary of " + n + " is " + Integer.toString(n,2) );
        String binary = Integer.toString(n,2);
        int consecutiveOnes = 0;
        int count = 0;
        for (int i = 0; i < binary.length(); i++){
//            System.out.println(binary.charAt(i));
            if(binary.charAt(i) == '1'){
                consecutiveOnes ++;
                if(count < consecutiveOnes){
                    count = consecutiveOnes;
                }
            }else{
                consecutiveOnes = 0;
            }

        }
        System.out.println(count);
    }
}
