/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 判断一个链表是否是回文 
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
 	    if(head == null || head.next == null)
	    	return true;
		/**
		 * 找到链表中点
		 * l1 -> l2 -> l3   --> l2
         * l1 -> l2 -> l3 -> l4  --> l3
         */
        ListNode slow = head;
	    ListNode fast = head;
	    while(fast != null && fast.next != null){
	    	slow = slow.next;
	    	fast = fast.next.next;
	    }
        //翻转后半段，和链表前半段比较
	    ListNode reverse = reverseList(slow);
	    ListNode p = head;
	    while(reverse != null){ //注意判断条件
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
	//非递归反转单链表
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
