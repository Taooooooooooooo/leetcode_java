package leetcode.editor.cn;

import java.util.*;
public class ID27RemoveElement{
	public static void main(String[] args) {
		Solution solution = new ID27RemoveElement().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int removeElement(int[] nums, int val) {
		int slow = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[slow] = nums[i];
				slow++;
			}
		}
		return slow;
	}
	}
//leetcode submit region end(Prohibit modification and deletion)
}
}