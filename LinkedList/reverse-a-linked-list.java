Node reverseList(Node head)
   {
        // add code here
        if(head == null)
         return head;
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!= null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head = prev;
        return head;
   }