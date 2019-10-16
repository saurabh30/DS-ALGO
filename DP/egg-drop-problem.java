/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int eggDrop(int e, int f)
    {
        int dp[][] = new int[e+1][f+1];
        int ans;
        for(int i = 1; i <= e; i++)
        {
            dp[i][1] = 1;
            dp[i][0] = 0;
        }
        
        for(int j = 1; j<=f; j++)
        {
            dp[1][j] = j;
        }
        
        for(int i = 2; i <= e; i++)
        {
            
            for(int j = 2; j <= f; j++)
            {
                dp[i][j] = Integer.MAX_VALUE;
                for(int x = 1; x<=j; x++)
                {
                    ans = 1+Math.max(dp[i-1][x-1], dp[i][j-x]);
                    if(ans < dp[i][j])
                        dp[i][j]  = ans;
                }        
            }
        }
        
        return dp[e][f];
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int e = scan.nextInt();
		    int f = scan.nextInt();
		    System.out.println(eggDrop(e,f));
		}
	}
}
