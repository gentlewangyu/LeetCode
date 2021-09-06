package api.java.string;

import scala.Char;

import java.util.HashSet;
import java.util.Set;

public class MaxSubString {
    public static void main(String[] args) {
        String s = "jbpnbwwd";
        int maxSubString = lengthOfLongestSubString(s);
        System.out.println("method lengthOfLongestSubString: " + maxSubString
                + ", 时间复杂度o(n2),空间复杂度o(n)");
    }

    public static int lengthOfLongestSubString(String str) {
        int length = str.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        for (int i=0; i<length; i++) {
            for (int j=i; j<length; j++) {
                if (!charSet.contains(str.charAt(j))) {
                    charSet.add(str.charAt(j));
                    maxLength = Math.max(maxLength, charSet.size());
                } else {
                    charSet.clear();
                }
            }
            charSet.clear();
        }
        return maxLength;
    }
}
