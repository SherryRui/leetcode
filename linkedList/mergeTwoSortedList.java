/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /*
    递归；先确定第一个head取法，递归确定后面的ListNode
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode mergedHead = null;
        if(l1.val > l2.val){
            mergedHead = l2;
            mergedHead.next = mergeTwoLists(l1,l2.next);
        }
        else{
            mergedHead = l1;
            mergedHead.next = mergeTwoLists(l1.next,l2);
        }
        return mergedHead;
    }
}
