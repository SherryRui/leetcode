/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.Stack;
import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
/*      非递归，借助栈实现

        Stack<Integer> stack = new Stack<Integer>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        
        ArrayList<Integer> reverseList = new ArrayList<Integer>();
        
        while(! stack.isEmpty()){
            reverseList.add(stack.pop());
        }
        
        return reverseList;
    }
    */
    //递归解法
        ArrayList<Integer> reverseList = new ArrayList<Integer>();
        if(listNode == null)
            return reverseList;
        reverseList = printListFromTailToHead(listNode.next);
        reverseList.add(listNode.val);
        return reverseList;
    }
}
