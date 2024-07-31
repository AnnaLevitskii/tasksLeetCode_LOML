import java.util.Arrays;
import java.util.LinkedHashMap;


public class CountLetters {
    public static void main(String[] args) {
        countLetters("Hello world");
        countLetters(" Hello world 1 ");
        countLetters("    ");
        countLetters("Hello dwe orlddd");
        countLetters("");
        countLetters("-!@><< >//;!");


    }
    public static void countLetters(String str){
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
}

