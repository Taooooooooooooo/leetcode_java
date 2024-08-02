package leetcode.editor.cn;

import java.util.*;
public class ID376WiggleSubsequence{
	public static void main(String[] args) {
		Solution solution = new ID376WiggleSubsequence().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <=1){return nums.length;}
		int curDiff = 0;
		int preDiff = 0;
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			curDiff = nums[i] - nums[i-1];
			if((curDiff>0 && preDiff <= 0) || (curDiff < 0 && preDiff>=0)){
				count++;
				preDiff = curDiff;
			}
		}
		return count;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}