/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int m = scan.nextInt();
		    int n = scan.nextInt();
		    String s1 = scan.next();
		    String s2 = scan.next();
		    char a1[] = s1.toCharArray();
		    char a2[] = s2.toCharArray();
		    int dp[][] = new int[m+1][n+1];
		    
		    
		    for(int j = 1; j<=n;j++)
		    {
		      dp[0][j] = 1 + dp[0][j-1];
		    }
		    
		    
		    for(int i = 1; i<=m;i++)
		    {
		      dp[i][0] = 1 + dp[i-1][0];
		    }
		    
		    for(int i = 1; i<=m; i++ )
		    {
		        for(int j = 1; j<=n ;j++)
		        {
		            
		            if(a1[i-1] == a2[j-1])
		            {
		                dp[i][j] = dp[i-1][j-1];
		            }
		            else
		            {
		                dp[i][j] = Math.min(dp[i][j-1],
		                Math.min(dp[i-1][j],dp[i-1][j-1]))+1;
		            }
		        }
		    }
		    
		    System.out.println(dp[m][n]);
		}
	}
}
