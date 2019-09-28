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
		    int l[] = new int[n];
		    
		    for(int i = 0; i<n; i++)
		    {
		        a[i] =  scan.nextInt();
		    }
		    
		    l[0] = 1;
		    
		    for(int i = 0 ; i < n ; i++)
		    {
		      int max = 0;  
		      
		      for(int j = 0; j < i ; j++)
		      {
		          if(a[i] > a[j] && l[j] > max)
		          {
		                max = l[j];
		          }
		      }
		      
		      l[i] = 1 + max;
		    }
		    int max = l[0];
		    
		    for(int i = 1 ;i<n;i++)
		    {
		      if(l[i] > max)
		        max = l[i];
		    }
		    
		    System.out.println(max);
		}
		
	}
}
