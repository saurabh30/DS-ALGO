class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int m = scan.nextInt();
		    int n = scan.nextInt();
		    
		    String str1 = scan.next();
		    char[] s1 = str1.toCharArray();
		    String str2 = scan.next();
		    char[] s2 = str2.toCharArray();
		    int dp[][] = new int[m+1][n+1];
		    int max = 0;
		    for(int i = 1; i<=m; i++)
		    {
		       for(int j = 1; j <=n; j++)
		       {
		           
		           if(s1[i-1] != s2[j-1])
		           {
		             dp[i][j] = 0;  
		           }
		           else
		           {
		             dp[i][j] = dp[i-1][j-1] + 1;     
		           }
		           if(dp[i][j] > max)
		            max = dp[i][j];
		       }
		    }
		    
		    System.out.println(max);
		}
	}
}