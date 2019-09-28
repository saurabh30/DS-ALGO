class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
        
       
       int l[] = new int[n];
       l[0] = 1;
       
       Arrays.sort(arr, new Comparator<Pair>()
        {
            public int compare(Pair a, Pair b)
            {
                return a.y - b.y;
            }
        });
        
       for(int i = 1 ; i < n ; i++)
	   {
		 int max = 0;  
		      
		 for(int j = 0; j < i ; j++)
		 {
		   if(arr[i].x > arr[j].y && l[j] > max)
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
		    
		 return max;
    }
}
