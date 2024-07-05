package leetcode.editor.cn;

import java.util.*;
public class ID977SquaresOfASortedArray{
	public static void main(String[] args) {
		Solution solution = new ID977SquaresOfASortedArray().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int [nums.length];
		int k=nums.length-1;
		for(int i=0,j = nums.length-1;i<=j;){
			if (nums[i]*nums[i]>nums[j]*nums[j]){
				result[k]=nums[i]*nums[i];
				k--;
				i++;
			}else {result[k]=nums[j]*nums[j];
				k--;
				j--;
			}
		}
		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}