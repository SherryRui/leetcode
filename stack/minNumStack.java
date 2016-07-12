import java.util.Stack;
//定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。

public class Solution {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> stackMin = new Stack<Integer>();
    
    public void push(int node) {
    	stack.push(node);
        //注意判断条件，否则可能导致程序崩溃
        if(stackMin.isEmpty() || node <= stackMin.peek())
            stackMin.push(node);
        else
            stackMin.push(stackMin.peek());
    }
    
    public void pop() {
        stack.pop();
        stackMin.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return stackMin.peek();
    }
}
