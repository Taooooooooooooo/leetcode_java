package leetcode.editor.cn;

import java.util.*;
public class ID33SearchInRotatedSortedArray{
	public static void main(String[] args) {
		Solution solution = new ID33SearchInRotatedSortedArray().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		while (low <= high){
			int mid = low +(high-low)/2;
			if (nums[mid]==target){
				return mid;
			}
			if (nums[low]<= nums[mid]){
				if (target>=nums[low] && target<nums[mid]){
					high = mid - 1;
				}else{
					low = mid +1;
				}
			}else {
				if(target<=nums[high]&& target>nums[mid]){
					low=mid+1;
				}else {
					high = mid -1;
				}
			}
		}
		return -1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}