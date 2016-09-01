/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
 	    if(head == null || head.next == null)
	    	return true;
        ListNode slow = head;
	    ListNode fast = head;
	    while(fast != null && fast.next != null){
	    	slow = slow.next;
	    	fast = fast.next.next;
	    }
	    ListNode reverse = reverseList(slow);
	    ListNode p = head;
	    while(reverse != null){
	    	if(reverse.val != p.val){
	    		return false;
	    	}
			else{
				reverse = reverse.next;
				p = p.next;
			}
	    }
	    return true;
    }
	public ListNode reverseList(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode p1 = head;
		ListNode p2 = head.next;
		while(p2 != null){
			ListNode tmp = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = tmp;
		}
		head.next = null;
		return p1;
	}
}
