/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0)
            return null;
        //添加一个新的头结点，则快结点走k步时，慢节点下一个结点为待删结点    
        ListNode p = new ListNode(0);
        p.next = head;
        
        ListNode ahead = p;
        ListNode behind = p;
        
        for(int i = 0;i < n;i++){
            if(ahead != null){
                ahead = ahead.next;
            }
            else
                return null;
        }
        
        while(ahead != null && ahead.next != null){
            ahead = ahead.next;
            behind = behind.next;
        }
        //如果待删结点为头结点
        if(behind.next == head){
            head = head.next;
            return head;
        }
        else{
        //一般情况，直接删除该节点
            behind.next = behind.next.next;
        }
        return head;
    }
}
