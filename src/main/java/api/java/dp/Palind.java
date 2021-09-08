package api.java.dp;

public class Palind {
    public static void main(String[] args) {
        Palind palind = new Palind();
        String str = "babad";
        String result = palind.longestPalindrome(str);
        System.out.println("method longestPalindrome result is: " + result + ", " +
                "时间复杂度o(n2),空间复杂度o(1)");
    }

    public String longestPalindrome(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        int maxLength = 1;
        int begin = 0;
        int length = str.length();
        char[] chars = str.toCharArray();
        boolean[][] dp = new boolean[length][length];
        for (int i=0; i<length; i++) {
            dp[i][i] = true;
        }
        for (int len=2; len <=length; len++) {
            for (int i=0; i<length; i++) {
                int j = i + len - 1;
                if (j >= length) break;
                if (chars[i] != chars[j]) {
                   dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if (dp[i][j] && (j - i + 1) > maxLength) {
                    begin = i;
                    maxLength = j - i + 1;
                }
            }
        }
        return str.substring(begin, begin + maxLength);
    }
}
