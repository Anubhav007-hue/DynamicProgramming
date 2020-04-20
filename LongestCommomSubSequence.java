public class LongestCommomSubSequence {

    public static void main(String[] args )
    {
        String text1="sea";
        String text2="eat";

        int n=text1.length() ;
        int m=text2.length ();

        int [][] dp=new int [n+1][m+1];

        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }

        for(int i=1;i<m+1;i++)
        {
            dp[0][m]=0;
        }
            StringBuilder sb=new StringBuilder();


        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
//                    sb.append(text2.charAt(i-1));
                }

                else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        int x_pointer=n;
        int y_pointer=m;

        while (x_pointer>0 && y_pointer>0)
        {
            if(text1.charAt(x_pointer-1)==text2.charAt(y_pointer-1))
            {
                sb.insert(0,text1.charAt(x_pointer-1));
                x_pointer--;
                y_pointer--;
            }
            else
            {
                if(dp[x_pointer-1][y_pointer]>dp[x_pointer][y_pointer-1])
                {
                    x_pointer--;
                }
                else
                {
                    y_pointer--;
                }
            }
        }
        String str=new String(sb );
        System.out.println(str);


    }
}
