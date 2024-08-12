package tasks;

import java.util.Arrays;

public class ValidParentheses {
    // ( )[ ]{ }  Output: true
    // ( [ ) { ] }  Output: true
    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        s= String.join("", java.nio.CharBuffer.wrap(arr));
        s=s.trim();

        for (int i = s.length()-1 ; i > 0  ; i--){
            s = s.replace("{}", "")
                    .replace("[]", "")
                    .replace("()", "");
        }
        if(s.contains("{") || s.contains("}") || s.contains("[") || s.contains("]")
                || s.contains("(") || s.contains(")")) return false;
        return true;
    }
}
