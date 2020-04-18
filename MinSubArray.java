public class MinSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};

        int n = nums.length;
        int w = 7;




        int[][] dp = new int[n + 1][w + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;

        }

        for (int i = 1; i < w + 1; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j - nums[i - 1]], dp[i - 1][j]);
                } else if (nums[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {

                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }



        }
    }

