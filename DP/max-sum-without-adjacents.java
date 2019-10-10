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
		    int a[] = new int[n];
		    
		    for(int i = 0; i<n; i++)
		    {
		      a[i] = scan.nextInt();
		    }
		    
		    int dp[] = new int[n+1];
		    dp[1] = a[0];
		    //dp[2] = a[1];
		    for(int i = 2; i<=n ; i++)
		    {
		        dp[i] = Math.max(dp[i-2]+a[i-1],dp[i-1]);
		    }
		    
		    System.out.println(dp[n]);
		}
		
	}
}
