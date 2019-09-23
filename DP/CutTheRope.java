/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int cutRope(int []a, int i, int l, int count)
    {
        
        
        if(l == 0)
         return count;
         
        if(i >= 3 || l < 0)
         return 0; 
        
        return Math.max(cutRope(a,i,l-a[i],++count),
              cutRope(a,i+1,l,count));
         
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int l = scan.nextInt();
		    int a[] = new int[4];
		    a[1] = scan.nextInt();
		    a[2] = scan.nextInt();
		    a[3] = scan.nextInt();
		    Arrays.sort(a);
	        //int result = Math.max(cutRope(a,0,l-a[0],1),
	        //cutRope(a,1,l,0));
	        //System.out.println(result-1);
	        int dp[][] = new int[4][l+1];
	        for(int i = 0; i<=3; i++)
	         dp[i][0] = 1;
	        
	        for(int j =1; j<=l; j++)
	         dp[0][j] = 0;
	         
	        for(int i =1; i<=3; i++)
	        {
	            for(int j = 1 ; j<=l; j++)
	            {
	                if(j<a[i])
	                {
	                    dp[i][j] = dp[i-1][j];
	                }
	                else{
	                int x = 0;
	                if(j == a[i] )
	                  x = 1;
	                else if(j-a[i] > 0 && dp[i][j-a[i]] != 0)
	                  x = dp[i][j-a[i]] +1;
	                dp[i][j] = Math.max(dp[i-1][j], x);
	                }
	            }
	        }
	        int max = 0; 
	        
	        for(int i = 1; i <= 3; i++)
	        {
	            if(max < dp[i][l])
	             max = dp[i][l];
	        }
	        /*for(int i = 1; i <= 3; i++ )
	        {
	            for(int j = 1; j <= l; j++)
	            {
	                System.out.print(dp[i][j]+" ");
	            }
	            System.out.println();
	        }*/
	        System.out.println(max);
		}
	}
}
