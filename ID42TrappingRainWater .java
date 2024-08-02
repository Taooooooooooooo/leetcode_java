package leetcode.editor.cn;

import java.util.*;
public class ID42TrappingRainWater{
	public static void main(String[] args) {
		Solution solution = new ID42TrappingRainWater().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trap(int[] height) {
        int size = height.length;
		if (size<=2){return 0;}
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		int sum = 0;
		for(int index = 1; index< size;index++){
			int stackTop = stack.peek();
			if (height[index] < height[stackTop]){
				stack.push(index);
			}else if (height[index] == height[stackTop]){
				stack.pop();
				stack.push(index);
			}else {
				int heightAtIndex = height[index];
				while (!stack.isEmpty() && (heightAtIndex>height[stackTop])){
					int mid = stack.pop();
					if (!stack.isEmpty()){
						int left = stack.peek();
						int h = Math.min(height[left],height[index])-height[mid];
						int w = index - left -1;
						int hold = h * w;
						if (hold > 0){sum += hold;}
						stackTop = stack.peek();
					}
				}
				stack.push(index);
			}
		}
		return sum;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}