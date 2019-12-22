class Tree
{
    class Leaf{
        Node n;
        int d;
        Leaf(Node n, int d)
        {
            this.n = n;
            this.d = d;
        }
    }
    // Should print bottom view of tree with given root
    public void bottomView(Node root)
    {
        // Your code here
        if(root == null) return;
        Queue<Leaf> q = new LinkedList<Leaf>();
        q.add(new Leaf(root,0));
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        while(!q.isEmpty())
        {
            Leaf x = q.poll();
            m.put(x.d,x.n.data);
            if(x.n.left!=null) q.add(new Leaf(x.n.left,x.d-1));
            if(x.n.right!=null) q.add(new Leaf(x.n.right,x.d+1));
        }
        ArrayList<Integer> l = new ArrayList<Integer>(m.keySet());
        Collections.sort(l);
        for(int i:l)
        {
            System.out.print(m.get(i)+" ");
        }
    }
}