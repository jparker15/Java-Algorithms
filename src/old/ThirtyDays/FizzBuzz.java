package old.ThirtyDays;

import java.util.Scanner;

public class FizzBuzz {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("fizz");
        new FizzBuzz();
    }

    public FizzBuzz() {

        String input = "";
        while(!input.equals("q")){
            System.out.println("Enter a number between 1 - 100");

            for (int num = 0;num < 100; num++){
                if(num % 3 == 0 && num % 5 ==0){
                    System.out.println("FizzBuzz");
                }else if(num % 3 == 0){
                    System.out.println("Fizz");
                }else if(num % 5 == 0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(num);
                }
            }

            System.out.println("Run again?");
            input = scanner.next();
        }



    }
}
