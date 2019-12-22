class Spiral
{
      void printSpiral(Node node) 
      {
           // Your code here
           if(node == null) return;
           Stack<Node> s1 = new Stack<Node>();
           Stack<Node> s2 = new Stack<Node>();
           s1.push(node);
           while(!s1.isEmpty()||!s2.isEmpty())
           {
               while(!s1.isEmpty())
               {
                   Node x = s1.pop();
                   System.out.print(x.data+" ");
                   
                   if(x.right!=null)
                    s2.push(x.right);
                   
                   if(x.left!=null)
                    s2.push(x.left);
                   
                   
               }
               
               while(!s2.isEmpty())
               {
                   Node x = s2.pop();
                    System.out.print(x.data+" ");
                   if(x.left!=null)
                    s1.push(x.left);
                   
                   if(x.right!=null)
                    s1.push(x.right);
               }
           }
      }
}