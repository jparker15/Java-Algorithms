package old.InterviewPrep;

public class Interface {
    public int divisorSum(int n) {
        int sum = 0;

        for(int i = 1; i <= n/2; i++){
            if(n%i == 0){
                sum += i;
            }
        }

        return sum + n;
    }
}
