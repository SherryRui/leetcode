public class Solution {
public int  NumberOf1(int n) {
  		int counter = 0;
    	while(n != 0){
            counter ++;
            n = n&(n-1);
        }
    	return counter;
     }
}
