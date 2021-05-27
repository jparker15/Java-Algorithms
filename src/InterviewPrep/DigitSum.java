//package InterviewPrep;
//
//public class DigitSum {
//
//
//    class Result {
//
//        /*
//         * Complete the 'superDigit' function below.
//         *
//         * The function is expected to return an INTEGER.
//         * The function accepts following parameters:
//         *  1. STRING n
//         *  2. INTEGER k
//         */
//
//        public static int superDigit(String n, int k) {
//            // Write your code here
//            // if(n.length() > 1{
//            //     return superDigit;
//            // }
//            //create super digit string
//            String p = "";
//            for(int i = 0; i < k; i++){
//                p += n;
//            }
//            //split super digit into seperate chars
//            String[] digits = p.split("");
//
//            int superDigit = 0;
//            for(String s: digits){
//
//                int parse = Integer.parseInt(s);
//                superDigit += parse;
//            }
//            //if superDigit length is > 1 recur method?
//
//            String strDigit = String.valueOf(superDigit);
//            int demo = 0;
//
//            String[] strDigitArr = strDigit.split("");
//            for(String s: strDigitArr){
//
//                int parse = Integer.parseInt(s);
//                demo += parse;
//
//                // System.out.println(demo);
//
//                if (superDigit >10){
//                    superDigit();
//                }
//
//
//            }
//            return demo;
//
//        }
//
//    }
//
//    public class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//            String n = firstMultipleInput[0];
//
//            int k = Integer.parseInt(firstMultipleInput[1]);
//
//            int result = Result.superDigit(n, k);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//    }
//
//}
