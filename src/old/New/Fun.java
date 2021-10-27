package old.New;

public class Fun {

    public static void main(String[] args) {
//        System.out.println(isLeapYear(2004));
//        System.out.println(isLeapYear(2100));
//        System.out.println(isLeapYear(2400));

        System.out.println(Fib(6));
    }

    public static boolean isLeapYear (int year){
//        boolean is = false;
//
//        if(year % 4 == 0){
//            is = true;
//        }
//        if (year % 4 == 0 && year % 100 == 0 ){
//            is =  false;
//        }
//        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
//            is = true;
//        }
//        return is;

        if (year % 4 != 0){
            return false;
        }
        if (year % 100 != 0){
            return true;
        }
        if (year % 400 != 0) {
            return false;
        }
        return true;
    }

    public static int Fib(int pos){
        int first =0;
        int second = 1;
        int next = 0;
        for(int i = 0; i <= pos; i++){
            next =  first + second;
            first = second;
            second = next;
        }

        return next;
    }


}
