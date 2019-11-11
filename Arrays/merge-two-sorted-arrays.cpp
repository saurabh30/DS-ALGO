using namespace std;

int main() {
	//code
	int t;
	cin >> t;
	while(t-->0)
	{
	    int m,n;
	    cin >> m;
	    cin >> n;
	    int arrm[m],arrn[n];
	    for(int i = 0; i < m; i++)
	    {
	        cin >> arrm[i];
	    }
	    
	    for(int i = 0; i < n; i++)
	    {
	        cin >> arrn[i];
	    }
	    
        int i = 0,j =0;
        while(i<m&&j<n)
        {
            if(arrm[i] < arrn[j])
            { cout << arrm[i] << " ";
              i++;
            }
            else{
             cout << arrn[i] << " ";
             j++;
            }
        }
        if(i<m)
        {
            while(i<m){
              cout << arrm[i] << " ";
              i++;
            }
        }
        
        if(j<n)
        {
            while(j<n){
              cout << arrn[i] << " ";
              j++;
            }
        }
        
        
        
	    cout<<endl;
	}
}