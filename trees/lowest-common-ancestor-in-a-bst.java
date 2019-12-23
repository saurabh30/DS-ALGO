class BST
{   
    Node LCA(Node node, int n1, int n2) 
    {
        // Your code here
        int n = node.data;
        if(n>n1 && n>n2) return LCA(node.left, n1, n2);
        if(n<n1 && n<n2) return LCA(node.right, n1, n2);
        return node;
    }
    
}