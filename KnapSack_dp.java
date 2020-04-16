public class KnapSack_dp {

    public static void main(String[] args )
    {
        int[] wt={10,20,30};
        int[] val={60,100,120};

        int n=wt.length;
        int w=50;

        int [][] dp=new int[n+1][w+1];

//        Initialising the dp matrix..............

        for(int i=1;i<w+1;i++)
        {
            dp[0][i]=0;
        }

        for(int i=1;i<n+1;i++)
        {
            dp[i][0]=0;
        }

//
//        Converting the recursive code into iterative....


        for(  int i=1;i<n+1;i++)
        {
            for( int j=1;j<w+1;j++)
            {
                if(wt[i-1]<=j)
                {
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }

                else if(wt[i-1]>j)
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        System.out.println("THe max profit is :"+dp[n][w]);


    }
}
