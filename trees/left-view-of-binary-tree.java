class Tree
{
    void leftView(Node root)
    {
      // Your code here
      StringBuffer str = new StringBuffer();
      if(root == null)
        return;
        
      Queue<Node> q = new LinkedList<Node>();
      q.add(root);
      q.add(null);
      str.append(root.data+" ");
      while(q.size()>1)
      {
          Node x = q.poll();
          if(x == null)
          {
              str.append(q.peek().data+ " ");
              q.add(null);
          }
          else
          {
              if(x.left != null)
               q.add(x.left);
              
              if(x.right != null)
               q.add(x.right);
          }
      }
      System.out.print(str);
      
    }
}