package leetcode.editor.cn;

import java.util.*;
public class ID26RemoveDuplicatesFromSortedArray{
	public static void main(String[] args) {
		Solution solution = new ID26RemoveDuplicatesFromSortedArray().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
       if (nums.length==0) {return 0;}
	   int i=0;
	   for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]){
				i++;
				nums[i]=nums[j];
		   }
		}
	   return i+1;
	}

}
//leetcode submit region end(Prohibit modification and deletion)

}