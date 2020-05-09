public class MinPartitionPalindrome {
    public static void main(String[] args )
    {
        String s="eegiicgaeadbcfacfhifdbiehbgejcaeggcgbahfcajfhjjdgj";
        int i=0;
        int j=s.length()-1;
        int Min=solve(s,i,j);
        System.out.println("The minimum number of partition is :"+Min);
    }

    public static int solve(String s,int i,int j )
    {
        if(i>=j)
        {
            return 0;
        }

        if(isPalindrome(s,i,j)==true)
        {
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int temp=solve(s,i, k)+solve(s,k+1,j)+1;
            min=Math.min(min,temp);
        }
        return min;
    }

    public static boolean isPalindrome(String s, int i, int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false ;
            }
            i++;
            j--;
        }
        return true ;
    }
}
