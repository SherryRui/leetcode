public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
		if(head == null || k == 0)
            return null;
        
        ListNode behind = head;
        ListNode ahead = head;
        //快结点先走k-1步，注意判断是否合法
        for(int i = 0;i < k-1;i++){
            if(ahead.next != null)
                ahead = ahead.next;
            else
                return null;
        }
        
        while(ahead.next != null){
            ahead = ahead.next;
            behind = behind.next;
        }
        
        return behind;
    }
}
