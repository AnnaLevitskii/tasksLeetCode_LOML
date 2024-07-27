public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        str2 = str2.toLowerCase().replace(" ", "");
        str1 = str1.toLowerCase().replace(" ", "");
        if(str1.length() != str2.length()) return false;
        for (int i = 0; i<str1.length(); i++){
            if(!str1.contains(""+str2.charAt(i))) return false;
            if(!str2.contains(""+str1.charAt(i))) return false;
        }
        return true;
    }
}
