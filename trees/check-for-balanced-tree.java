class Tree
{
    class Result
    {
        int h;
        boolean b;
        Result(boolean b, int h)
        {
            this.h = h;
            this.b = b;
        }
    }
    Result isBalancd(Node root)
    {
        if(root == null) return new Result(true,0);
        if(root.left == null && root.right == null)
         return new Result(true,1);
        Result l = isBalancd(root.left);
        Result r = isBalancd(root.right);
        return new Result(l.b&&r.b&&Math.abs(l.h-r.h)<=1,
                          Math.max(l.h,r.h)+1);
    }
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
	// Your code here
	   return isBalancd(root).b;
    }
}