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
	   int ans = 0;
	   Stack<Integer> s = new Stack<Integer>();
	   s.push(x);
	   while(!s.empty())
	   {
	   	 int r = s.pop();
	   	 if(r == y)
	   	 {ans = 1; break;}
	   	 LinkedList<Integer> temp = map.get(r);
	   	 while(!temp.isEmpty())
	   	 {
	   	 	int p = temp.poll();
	   	 	s.push(p);
	   	 }
	   	 
	   }
	   System.out.println(ans);
	}
}
