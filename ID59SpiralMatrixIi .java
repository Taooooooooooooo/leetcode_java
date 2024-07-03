package leetcode.editor.cn;

import java.util.*;
public class ID59SpiralMatrixIi{
	public static void main(String[] args) {
		Solution solution = new ID59SpiralMatrixIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
		int [][] nums = new int [n][n];
		int start_X = 0;
		int start_Y = 0;
		int off_Set = 1;
		int count = 1;
		int loop = 1;
		int i,j;

		while (loop <= n / 2){
			for (j = start_Y;j<n-off_Set;j++){
				nums[start_X][j] = count;
				count++;
			}
			for (i=start_X;i<n-off_Set;i++){
				nums[i][j]=count;
				count++;
			}
			for(;j>start_Y;j--){
				nums[i][j]=count;
				count++;
			}
			for (;i>start_X;i--){
				nums[i][j]=count;
				count++;
			}
			start_X++;
			start_Y++;
			off_Set++;
			loop++;
		}
		if (n % 2 == 1){
			nums[start_X][start_Y] = count;
		}
		return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}