package old.InterviewPrep;

import java.io.*;
import java.util.*;

public class Sales {


        // Complete the sockMerchant function below.
        static int sockMerchant(int n, int[] ar) {
            int pairs = 0;
            int count = 0;

            HashMap<Integer, Integer> socks = new HashMap<Integer, Integer>();

            // int[10] arr = [1,2,3,4,5,6,6,6,7,8]

            for (int i = 0; i < n ; i++) {
                if(socks.containsKey(ar[i])){
                    socks.put(ar[i],socks.get(ar[i]) + 1);
                }else{
                    socks.put(ar[i], 1);
                }
            }
            //in Java 3/2 = 1;
            // 7/3 = 2;
            for(int i: socks.values()){
                pairs += i / 2;
            }

            System.out.println(socks);
            return pairs;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] ar = new int[n];

            String[] arItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arItem = Integer.parseInt(arItems[i]);
                ar[i] = arItem;
            }

            int result = sockMerchant(n, ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();

    }

}
