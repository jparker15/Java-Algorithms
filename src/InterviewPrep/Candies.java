//package InterviewPrep;
//
//public class Candies {
//    class Result {
//
//        /*
//         * Complete the 'candies' function below.
//         *
//         * The function is expected to return a LONG_INTEGER.
//         * The function accepts following parameters:
//         *  1. INTEGER n
//         *  2. INTEGER_ARRAY arr
//         */
//
//        public static long candies(int n, List<Integer> arr) {
//            // Write your code here
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
//            int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> arr = IntStream.range(0, n).mapToObj(i -> {
//                try {
//                    return bufferedReader.readLine().replaceAll("\\s+$", "");
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                }
//            })
//                    .map(String::trim)
//                    .map(Integer::parseInt)
//                    .collect(toList());
//
//            long result = Result.candies(n, arr);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//    }
//}
