import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int longestYet = 1;
        int longestNow = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i<s.length(); i++){
            if(set.add(s.charAt(i))){
                longestNow++;
            }else {
                longestYet = Math.max(longestYet, longestNow);
                longestNow=0;
                i-=(set.size());
                set.clear();
            }

        }
        return Math.max(longestYet, longestNow);
    }
}
