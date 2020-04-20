public class MinInsertDelete {

    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i < m + 1; i++) {
            dp[0][m] = 0;
        }


        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
//                    sb.append(text2.charAt(i-1));
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int insert = Math.abs(n - dp[n][m]);
        int delete = Math.abs(m - dp[n][m]);

        System.out.println(insert+delete);
    }


}
