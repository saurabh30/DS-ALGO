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
		    int n = scan.nextInt();
		    int a[][] = new int[n][n];
		    int dp[][] = new int[n][n];
		    
		    for(int i = 0; i<n ;i++)
		    {
		        for(int j = 0; j<n;j++)
		        {
		            a[i][j] = scan.nextInt();
		        }
		    }
		    
		    for(int j = 0; j<n; j++)
		    {
		        dp[0][j] = a[0][j];
		    }
		    
		    for(int i =1; i<n;i++)
		    {
		        for(int j =0; j<n; j++)
		        {
		            int x = j-1>=0?dp[i-1][j-1]:0;
		            //System.out.println(x);
		            int y = dp[i-1][j];
		            //System.out.println(y);
		            int z = j+1<n?dp[i-1][j+1]:0;
		            //System.out.println(z);
		            dp[i][j] = Math.max(x, Math.max(y,z))+a[i][j];
		            //System.out.println(dp[i][j]);
		        }
		    }
		    
		    int max = 0;
		    
		    for(int j = 0; j<n; j++)
		    {
		       max= dp[n-1][j] > max ? dp[n-1][j] : max;
		    }
		    
		    /*for(int i = 0 ; i < n; i++ )
		    {
		        for(int j = 0 ; j < n; j++)
		        {
		            System.out.print(dp[i][j]+" ");
		        }
		        System.out.println();
		    }*/
		    System.out.println(max);
		}
	}
}
