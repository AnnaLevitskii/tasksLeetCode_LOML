package tasks;

public class FindIndexFirstOccurrenceString {
    public static void main(String[] args) {

        System.out.println(strStr("sadbutsad", "sad"));//0


        System.out.println(strStr("leetcode", "leeto")); //-1
        System.out.println(strStr("ogleetocode", "leeto")); // 2
        System.out.println(strStr("ogleetocode", "leeto")); // 2
    }
    public static int strStr(String haystack, String needle) {
        if(!haystack.contains(needle))  return -1;
        String[] arr3 = haystack.split(needle, -2);
        return arr3[0].length();

    }
}
