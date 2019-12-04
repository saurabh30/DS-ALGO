class Traversal
{
    static void dfs(int src, ArrayList<ArrayList<Integer>> list, 
    boolean vis[])
    {
       // add your code here
       if(vis[src])
        return;
       
       System.out.print(src + " ");
       vis[src] = true;
       ArrayList<Integer> l = list.get(src);    
       for(int i : l)
       {
          dfs(i,list,vis);
       }
    }
}
