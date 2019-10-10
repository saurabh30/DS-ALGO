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
            for(int i = 0; i < n ; i++)
            {
                a[i] = scan.nextInt();
            }
            int sum = scan.nextInt();
            int dp[][] = new int[n+1][sum+1];
            for(int i = 0 ; i <=n ; i++)
            {
                dp[i][0] = 1; 
            }
            for(int j = 1 ; j <= sum ; j++)
            {
                dp[0][j] = 0;
            }
            for(int i = 1; i <=n ; i++)
            {
                for(int j = 1 ; j <=sum ; j++)
                {
                    
                    int x = dp[i-1][j];
                    int y = j>=a[i-1]?dp[i][j-a[i-1]]:0;
                    
                    dp[i][j] = x+y;
                    
                }
            }
            //for(int i = 0 ; i <= n ; i++)
            //{
            //for(int j =0 ; j <= sum ; j++)
            //{
                //System.out.print(dp[i][j]+" ");
            //}
            //System.out.println();
            //}
            System.out.println(dp[n][sum]);
        }	
	}
}