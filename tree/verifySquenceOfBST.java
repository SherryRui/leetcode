/**
  输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
**/
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
	    return true;
        else
            return isSquenceOfBST(sequence,0,sequence.length-1);
    }
    public boolean isSquenceOfBST(int[] sequence,int start,int end){
        if(end == start)
            return true;
        else{
            int pivot = sequence[end];
            int i = start;
            
            while(i <=end && sequence[i] < pivot)
                i++;
            int j = i;
            for(;j <= end;j++){
               if(sequence[i] < pivot)
                   return false;
               else
                   continue;
            }
            return isSquenceOfBST(sequence,start,i-1) && isSquenceOfBST(sequence,j,end-1);
            }
    }
}
