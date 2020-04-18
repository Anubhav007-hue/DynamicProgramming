public class CountSubSetDiffrence {
    public  static void main(String[] args ) {
        int[] wt = {1, 1, 2, 3};
        int n = wt.length;

        int diffrence = 1;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum=sum+wt[i];
        }

        int w=(diffrence+sum)/2;

        int[][] dp=new int[n+1][w+1];

        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=1;
        }

        for(int i=1;i<w+1;i++)
        {
            dp[0][i]=0;
        }

//        Magical code for doing the work...........

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<w+1;j++)
            {
                if(wt[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-wt[i-1]]+dp[i-1][j];
                }

                else if(wt[i-1]>j)
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
