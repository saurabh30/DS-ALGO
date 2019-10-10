import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		long a[] = new long[10000];
		a[0] = 1;
		int i2=0,i3=0,i5 = 0;
		for(int i = 1; i < 10000 ; i++)
		{
		    a[i] = Math.min(a[i2]*2,Math.min(a[i3]*3,a[i5]*5));
		    
		    if(a[i] == a[i2]*2)
		       i2++;
		       
		    if(a[i] == a[i3]*3)
		       i3++;
		       
		    if(a[i] == a[i5]*5)
		       i5++;     
		         
		}
		while(t-->0)
		{
		    int n = scan.nextInt();
		    System.out.println(a[n-1]);
		    
		}
	}
}