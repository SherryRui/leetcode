/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
First Step: Assume the first pointer runs from head at a speed of 1-by-1 step, as S, and the second pointer runs at a speed of 2-by-2 step, as 2S, then two pointers will meet at MEET-POINT, using the same time. Define outer loop is A, the distance from CIRCLE-START-POINT to MEET-POINT is B, and the distance from MEET-POINT to CIRCLE-START-POINT is C (Apparently, C=loop-B), then (n*loop+a+b)/2S = (a+b)/S, n=1,2,3,4,5,....

Converting that equation can get A/S=nloop/S-B/S. Since C=loop-B, get A/S = ((n-1)loop+C)/S.

That means, as second step, assuming a pointer running from head and another pointer running from MEET-POINT both at a speed S will meet at CIRCLE-START-POINT;

    (CIRCLE-START-POINT)
            |
-------A----@----------------
            |               |
            |               |
            C               B
            |               |
            |-------@-------|
                    |
               (MEET-POINT)
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
    	if (pHead == null || pHead.next == null) return null;
    	ListNode slow = pHead, fast = pHead, start = pHead;
    	while (fast != null && fast.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        	if (slow == fast) {
            	while (slow != start) {
            	    slow = slow.next;
                	start = start.next;
            	}
            	return start;
        	}
    	}
    	return null;
    }
}
