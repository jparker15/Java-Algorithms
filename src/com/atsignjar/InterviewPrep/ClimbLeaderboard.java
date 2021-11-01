//package com.atsignjar.InterviewPrep;
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//public class ClimbLeaderboard {
//
//    class RankedPlayer {
//        int score;
//        int rank;
//
//        RankedPlayer(int score, int rank){
//            this.score = score;
//            this.rank = rank;
//        }
//    }
//
//    class Result {
//
//        /*
//         * Complete the 'climbingLeaderboard' function below.
//         *
//         * The function is expected to return an INTEGER_ARRAY.
//         * The function accepts following parameters:
//         *  1. INTEGER_ARRAY ranked
//         *  2. INTEGER_ARRAY player
//         */
//
//        public List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
//            // Write your code here
//
//
//            List<Integer> uniqueRanked = new ArrayList<>();
//            List<RankedPlayer> playerRank = new ArrayList<>();
//            //add unique scores to new List
//            for(int score: ranked){
//                if(!uniqueRanked.contains(score)){
//                    uniqueRanked.add(score);
//                }
//            }
//            // loop rank starts at lowest score and works backwards
//            for(int rank = uniqueRanked.size() - 1; rank > 0; rank--){
//                for (int score: player){
//
//                    if(score <= uniqueRanked.get(rank)){
//                        playerRank.add(rank);
//
//                    }
//                }
//            }
//
//            return playerRank;
//
//
//            //create data structure containing RankedPlayer classes sorted by RankedPlayer.rank
//
//            //compare sorted RankedPlayer structure to player List scores
//        }
//
//    }
//
//
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                    .map(Integer::parseInt)
//                    .collect(toList());
//
//            int playerCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                    .map(Integer::parseInt)
//                    .collect(toList());
//
//            List<Integer> result = Result.climbingLeaderboard(ranked, player);
//
//            bufferedWriter.write(
//                    result.stream()
//                            .map(Object::toString)
//                            .collect(joining("\n"))
//                            + "\n"
//            );
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//
//}
