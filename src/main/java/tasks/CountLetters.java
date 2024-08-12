package tasks;

import java.util.Arrays;
import java.util.LinkedHashMap;


public class CountLetters {
    public static void main(String[] args) {
        countLettersSplit("Hello world");
        countLettersSplit(" Hello world 1 ");
        countLettersSplit("    ");
        countLettersSplit("Hello dwe orlddd");
        countLettersSplit("");
        countLettersSplit("-!@><< >//;!");


    }
    public static void countLettersSplit(String str){
        str = str.toLowerCase();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<str.length() ;i++){
            char c = str.charAt(i);
            if(!map.containsKey(c)){
                String[] arr = str.split(""+c, -2);
                map.put(c, arr.length-1);
            }
        }
        System.out.println(map);
    }
    public static void countLettersASCII(String str){
        // a - 97 z - 122
        str = str.toLowerCase();
        int[] arr = new int[26];
        for(int i = 0; i<str.length() ;i++){
            char c = str.charAt(i);
            int intC = (int) c;
            arr[intC-97] += ++arr[intC-97];
            System.out.println();

        }
    }
}

