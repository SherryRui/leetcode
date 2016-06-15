/*
   eg: list1: 1->2->3->4
       list2: 6->3->4
       
       遍历时：
       list1: 1->2->3->4->6->3->4
       list2: 6->3->4->1->2->3->4
       
       很棒的解法，leetcode上面给出的最佳解法之一
       剑指offer上面给出的解法是：先分别遍历两个链表的长度，然后做差，长的链表先走差值，等长度相等后再同时遍历
*/
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //boundary check
    if(headA == null || headB == null) return null;

    ListNode a = headA;
    ListNode b = headB;

    //if a & b have different len, then we will stop the loop after second iteration
    while( a != b){
        //for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a == null? headB : a.next;
        b = b == null? headA : b.next;    
    }

    return a;
}
