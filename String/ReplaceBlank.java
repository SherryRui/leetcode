/*
  合并两个数组/字符串，如果从前往后复制需要重复移动数字多次，那么可以考虑从后向前复制，减少移动次数，提高效率。
  从前往后移动。时间效率O(n^2);从后向前移动，效率O(n);
*/
public class Solution {
    public String replaceSpace(StringBuffer str) {
		int originalLength = str.length();
        int numberOfBlank = 0;
        for(int i = 0;i < originalLength;i++){
            if(str.charAt(i) == ' ')
                numberOfBlank ++;
            else
                continue;
        }
        
        int newLength = originalLength + numberOfBlank * 2;
        int index = newLength - 1;
        char[] charArray = new char[newLength];
        for(int i = originalLength - 1; i >= 0; i--){
            if(str.charAt(i) == ' '){
                charArray[index --] = '0';
                charArray[index --] = '2';
                charArray[index --] = '%';
            }
            else{
                charArray[index --] = str.charAt(i);
            }
        }
        return String.valueOf(charArray);
    }
}
