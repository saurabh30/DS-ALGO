/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static void swap(int i,int j,int k)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return;
	}
	static int partition(int i, int j,int a[])
	{
		int pivot = a[i];
		int pindex = i;
		for(int k = i; k<j; k++)
		{
			if(a[k] < pivot)
			{
				swap(k,pindex,a);
				pindex++;
			}
		}
		swap(pindex,i,a);
		return pindex;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			String line = br.readLine();
			int k = Integer.parseInt(br.readLine());
			String[] str = line.trim().split("\\s+");
			for(int i = 0; i<n ;i++)
			{
				a[i] = Integer.parseInt(str[i]);
			}
			System.out.println(partition(i,j,a));
		}
	}
}
