package leetcode.editor.cn;

import java.util.*;
public class ID41FirstMissingPositive{
	public static void main(String[] args) {
		Solution solution = new ID41FirstMissingPositive().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
		int missingNumber = 1;
        for (int num : nums) {
            if (num > 0) {
                if(num == missingNumber){
					missingNumber++;
				}else if (num > missingNumber){
					break;
				}
            }
        }
		return missingNumber;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}