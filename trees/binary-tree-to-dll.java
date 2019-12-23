class GfG
{
    Node head;Node pvs;
    void Inorder(Node root)
    {
        if(root == null) return;
	    Inorder(root.left);
	    if(head == null)
	    {
	        head = root;
	        pvs = head;
	    }
	    else
	    {
	        pvs.right = root;
	        root.left = pvs;
	        pvs = root;
	    }
	    Inorder(root.right);
    }
    Node bToDLL(Node root)
    {
	//  Your code here	
	    head = null;
	    pvs = null;
	    Inorder(root);
	    return head;
    }
}