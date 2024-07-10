package leetcode.editor.cn;

import java.util.*;
public class ID18FourSum{
	public static void main(String[] args) {
		Solution solution = new ID18FourSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		if (nums.length<=3){
			return result;
		}
		for (int k = 0; k < nums.length-3; k++) {
			// 去重
			if(k>0 && nums[k] == nums[k-1]){
				continue;
			}
			for(int i = k+1;i<nums.length-2;i++){
				// 去重
				if (i>k+1 && nums[i] == nums[i-1]){
					continue;
				}
				int left = i+1;
				int right = nums.length-1;
				while (left<right){
					long sum =(long) nums[k]+nums[i]+nums[left]+nums[right];
					if (sum>target){
						right--;
					}else if (sum<target){
						left++;
					}else {
						result.add(Arrays.asList(nums[k],nums[i],nums[left],nums[right]));
						while (right>left && nums[right] ==nums[right-1]){
							right--;
						}
						while (right>left && nums[left] ==nums[left+1]){
							left++;
						}
						right--;
						left++;
					}
				}
			}
		}
		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}