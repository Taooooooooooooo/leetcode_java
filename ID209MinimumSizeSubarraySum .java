package leetcode.editor.cn;

import java.util.*;
public class ID209MinimumSizeSubarraySum{
	public static void main(String[] args) {
		int target = 7;
		int [] nums = {2,3,1,2,4,3};


		Solution solution = new ID209MinimumSizeSubarraySum().new Solution();
		StringBuilder sb = new StringBuilder(target,nums);

		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
		int n = nums.length;
		int result = n + 1;
		int i = 0;
		int sum = 0;
		for (int j = 0; j < nums.length; j++) {
			sum += nums[j];
			while (sum>=target){
				int sub = j-i+1;
				result = Math.min(result,sub);
				sum -= nums[i];
				i++;
			}

		}
		return result == n + 1 ? 0 : result;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}