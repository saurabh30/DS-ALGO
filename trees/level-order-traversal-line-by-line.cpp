void levelOrder(Node* node)
{
  //Your code here
        queue<Node *> q;
        Node* s = new Node(0);
        //string ans;
        //StringBuffer ans = new StringBuffer();
        if(node == NULL)
        {
            return;
        }
        //q = new LinkedList<>();
        q.push(node);
        q.push(s);
        while(q.size() != 1)
        {
            Node *x = q.front();
            q.pop();
            if(x->data == 0){
                cout<<"$"<<" ";
                q.push(s);
            }
            else
            {
            
                cout<<x->data<<" ";
                if(x->left != NULL)
                    q.push(x->left);
                if(x->right != NULL)
                    q.push(x->right);
            
            }
        }    
       cout<<"$"<<" ";
}
