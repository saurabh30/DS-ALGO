/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Map<Integer, LinkedList<Integer>> map =
		 new HashMap<Integer, LinkedList<Integer>>();
		
		for(int i = 0; i < n; i++)
		{
			int x = scan.nextInt();
			map.put(x,new LinkedList<Integer>());
		}
		
	   int e = scan.nextInt();
	   for(int i = 0 ; i <  e; i++)
	   {
	   	 int x = scan.nextInt();
	   	 int y = scan.nextInt();
	   	 map.get(x).add(y);
	   	
	   }
		
	   int x = scan.nextInt();
	   int y = scan.nextInt();
	   
	   System.out.println(map.get(x));
	}
}
