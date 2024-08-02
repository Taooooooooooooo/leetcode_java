package leetcode.editor.cn;

import java.util.*;
public class ID53MaximumSubarray{
	public static void main(String[] args) {
		Solution solution = new ID53MaximumSubarray().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {


		int faster = 0;
		for (int low = 0; low < nums.length) {
			int  sum += nums[low];
			if (sum>0){faster ++;}
			else (low == faster);

		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}