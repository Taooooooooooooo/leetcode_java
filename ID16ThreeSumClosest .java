package leetcode.editor.cn;

import java.lang.annotation.ElementType;
import java.util.*;
public class ID16ThreeSumClosest{
	public static void main(String[] args) {
		Solution solution = new ID16ThreeSumClosest().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length<3){
			return -1;
		}
		Arrays.sort(nums);
		int closestSum = nums[0]+nums[1]+nums[2];

		for (int i = 0; i < nums.length-2; i++) {
			int left = i+1;
			int right = nums.length-1;

			while (left<right){
				int currentSum = nums[i]+nums[left]+nums[right];
				if (currentSum == target){
					return currentSum;
				}else if(currentSum<target){
					left++;
				}else {right--;}
				if (Math.abs(currentSum-target)<Math.abs(closestSum-target)){
					closestSum = currentSum;
				}
			}
		}
		return closestSum;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}