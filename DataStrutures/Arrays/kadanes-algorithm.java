
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws 
	java.lang.Exception{
		//code
		BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine());
		    String line = br.readLine();
		    int a[] = new int[n];
		    String[] str = line.trim().split("\\s+");
		    for(int i = 0; i<n; i++)
		    {
		        a[i] = Integer.parseInt(str[i]);
		    }
		    
		    int currSum = a[0];
		    int maxSum = a[0];
		    
		    for(int i =1; i<n ; i++)
		    {
		        if(a[i] >= a[i]+currSum)
		        {
		            currSum = a[i];
		        }else
		        {
		            currSum += a[i];   
		        }
		        
		        if(currSum > maxSum)
		        {
		          maxSum = currSum;
		        }
		    }
		    System.out.println(maxSum);
		}
	}
}