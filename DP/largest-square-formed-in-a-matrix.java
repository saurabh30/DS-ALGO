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
		    int m = scan.nextInt();
		    int a[][] = new int[n][m];
		    int dp[][] = new int[n][m];
		    for(int i = 0 ; i < n ; i++)
		    {
		        for(int j = 0; j < m ;j++)
		        {
		            a[i][j] = scan.nextInt();
		        }
		    }
		     int max = 0;
		    
		    for(int j = 0 ; j < m; j++)
		      {
		          dp[0][j] = a[0][j];
		            if(dp[0][j] >max)
		            max = dp[0][j];
		          
		      }    
		    
		    for(int i = 0 ; i < n; i++)
		    {
		      dp[i][0] = a[i][0];
		      if(dp[i][0] >max)
		            max = dp[i][0];
		    }
		   
		    for(int i =1; i< n ; i++)
		    {
		        for(int j = 1; j<m ; j++)
		        {
		            if(a[i][j] == 1)
		            {
		              dp[i][j] = 1 + Math.min(dp[i][j-1], 
		                 Math.min(dp[i-1][j], dp[i-1][j-1]));
		            
		              if(dp[i][j] > max)
		                 max = dp[i][j];
		            }
		            
		        }
		    }
		    
		    System.out.println(max);
		        
		}
	}
}
