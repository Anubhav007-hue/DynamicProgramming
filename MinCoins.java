public class MinCoins {

    public static void main(String[] args )
    {
        int[] coins={9,6,5,1};
        int w=11;
        int n=coins.length;
        int [][] dp=new int[n+1][w+1];
        for(int i=1;i<n+1;i++)
        {
            dp[i][0]=0;
        }

        for(int i=0;i<w+1;i++)
        {
            dp[0][i]=Integer.MAX_VALUE-1;
        }

//        for(int i=1;i<w+1;i++)
//        {
//            if(i%coins[0]==0)
//            {
//                dp[1][i]=i/coins[0];
//            }
//            else {
//                dp[1][i]=Integer.MAX_VALUE-1;
//            }
//        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<w+1;j++)
            {
                if(coins[i-1]<=j)
                {
                    dp[i][j]=Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        System.out.println(dp[n][w]);

        String str="q";


    }
}
