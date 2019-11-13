class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class GfG
{
	void reversePrint(Node node) 
        {
            // your code here
            if(node == null)
               return;
            
            Stack<Integer> s = new Stack<Integer>();
            Queue<Node> q = new LinkedList<>();
            q.add(node);
            s.push(node.data);
            q.add(null);
            s.push(-1);
            while(q.size()!=1)
            {
              Node x = q.remove();
              if(x!= null)
               { 
                   //s.push(x.data);
                   if(x.left!=null)
                    { 
                        q.add(x.left);
                        s.push(x.left.data);
                    }
                    
                   if(x.right!=null)
                     {
                        q.add(x.right);
                        s.push(x.right.data);
                     }    
               }   
              else
               {
                   q.add(null);
                   s.push(-1);
               }   
            }
            Stack<Integer> temp = new Stack<Integer>();
            while(!s.isEmpty())
            {
                int x = s.pop();
                
                if(x == -1)
                {
                    while(!temp.isEmpty())
                    { 
                        int y = temp.pop();
                        System.out.print(y + " ");
                    }
                }
                else
                {
                    temp.push(x);
                }
                
            }
            int y = temp.pop();
            System.out.print(y + " ");
        }
}      
