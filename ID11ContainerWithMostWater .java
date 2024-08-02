package leetcode.editor.cn;

import java.util.*;
public class ID11ContainerWithMostWater{
	public static void main(String[] args) {
		Solution solution = new ID11ContainerWithMostWater().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
		int left = 0;
		int right = height.length-1;
		while (left < right){
			if (height[left]<height[right]){
				maxArea = Math.max(maxArea,height[left]*(right-left));
				left +=1;
			}else {
				maxArea = Math.max(maxArea,height[right]*(right-left));
				right-=1;
			}
		}
		return maxArea;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}