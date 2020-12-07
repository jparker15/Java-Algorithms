package com.atsignjar;

import java.util.*;

public class Main {
    public static void main(String[] args){
        simpleRansom("hello     world","angell lionhart");
    }

    public static boolean simpleRansom(String message, String source){
        HashMap<String, Integer> letterCount = new HashMap<>();
        String[] sourceArray = source.split("");
        for( var letter: sourceArray){
//            System.out.println(letterCount);
            if(letter.equals(" ")){
                continue;
            }
            if(letterCount.containsKey(letter)){
                letterCount.put(letter, letterCount.get(letter) + 1);
                continue;
            }
            letterCount.put(letter, 1);
        }

        String[] messageArray = message.split("");;
        for( var letter: messageArray){
            System.out.println(letter);
            System.out.println(letterCount);
            if(!letterCount.containsKey(letter)){
                return false;
            }
            if(letterCount.get(letter) == 0){
                return false;
            }
            /* letter is in the lettercount and there is at least 1*/
            letterCount.replace(letter, letterCount.get(letter) -1);
        }

        return true;
    }

    public static String reverseA(String msg){
        return msg;
    }
}




/* hello world || ehwni ellawo eiwnd iwr
    h: 1, e:1, l:3, o:2, w:1, r:1, d:1
    e: 3, h: 1, w: 4, n:2, i:3, l:2, a:1, o:1, d:1, r:1
*/

