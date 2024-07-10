package leetcode.editor.cn;

import java.security.interfaces.RSAKey;
import java.util.*;
public class ID15ThreeSum{
	public static void main(String[] args) {
		Solution solution = new ID15ThreeSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]>0){
				return result;
			}
			if (i>0 && nums[i] == nums[i-1]){
				continue;
			}
			int left = i+1;
			int right = nums.length-1;
			while (right>left){
				int sum = nums[i]+nums[left]+nums[right];
				if (sum>0){
					right--;
				}else if (sum<0){
					left++;
				}else {
					//Arrays.asList is a utility method in Java that converts its arguments into a fixed-size list.
					result.add(Arrays.asList(nums[i],nums[left],nums[right]));
					while (right > left && nums[right] == nums[right - 1]) {
						right--;
					}

					while (right > left && nums[left] == nums[left + 1]) {
						left++;
					}
					// 当满足sum= 0，
					right--;
					left++;
				}
			}

		}
		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}