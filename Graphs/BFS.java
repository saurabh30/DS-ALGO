*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
*ArrayList<ArrayList<Integer>> list: represent graph containing vertices
                                    and edges between them
*vis[]: boolean array to represent visited vertex
*s: starting vertex 
*/
class Traversal
{
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov)
    {
       // add your code here
       
          
               Queue<Integer> q = new LinkedList<Integer>();
               vis[s] = true;
               q.add(s);
               while(q.size() != 0)
               {
                   s = q.poll();
                   System.out.print(s + " ");
                   Iterator<Integer> it = list.get(s).iterator();
                   while(it.hasNext())
                   {
                       int n = it.next();
                       if(!vis[n])
                       {
                           vis[n] = true;
                           q.add(n);
                       }
                   
               }
           }
           
       
    }
}
