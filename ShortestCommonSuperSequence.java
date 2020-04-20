public class ShortestCommonSuperSequence {
    public static void main(String[] args )
    {
        String text1="sea";
        String text2="eat";

        int n=text1.length();
        int m=text2.length();

        int[][] dp_lcs=new int[n+1][m+1];




        for(int i=0;i<n+1;i++)
        {
            dp_lcs[i][0]=0;
        }

        for(int i=1;i<m+1;i++)
        {
            dp_lcs[0][m]=0;
        }




        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp_lcs[i][j]=1+dp_lcs[i-1][j-1];
//                    sb.append(text2.charAt(i-1));
                }

                else {
                    dp_lcs[i][j]=Math.max(dp_lcs[i-1][j],dp_lcs[i][j-1]);
                }
            }
        }



        int count = (n+m)-(dp_lcs[n][m]);
      System.out.println(count);
    }
}
