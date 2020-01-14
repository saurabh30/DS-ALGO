class LinkedList
{
    Node sortedMerge(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     if(headA == null) return headB;
     if(headB == null) return headA;
     Node head = headA.data < headB.data ? headA : headB;
     Node a = head;
     Node b = headA == head ? headB : headA;
     while(a!= null && a.next != null && b != null)
     {
         while(a.next != null && a.next.data <= b.data)
         {
             a = a.next;
         }
         if(a.next == null) break;
         Node x= b;
         while(b.next != null && b.next.data <=  a.next.data)
         {
             b = b.next;
         }
         Node y = b;
         b = b.next;
         y.next = a.next;
         a.next = x;
         a = y.next;
     }
     if(b!=null)
       a.next = b; 
     return head;
   } 
}