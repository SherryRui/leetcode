/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
/*      迭代算法
        if(head==null) return null;  
        if(head.next==null) return head;  
          
        ListNode p = head.next;  
        ListNode n = reverseList(p);  
        head.next = null;
        p.next = head;
        return n;  */
//      非迭代
        if(head==null) 
            return null;  
        if(head.next==null) 
            return head;  
        ListNode next = head.next;
        ListNode curr = head;
        ListNode tmp;
        while(next.next != null){
            tmp = next.next;
            next.next = curr;
            
            curr = next;
            next = tmp;
        }
        head.next = null;
        next.next = curr;
        return next;
    }
}
