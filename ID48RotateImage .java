package leetcode.editor.cn;

import java.util.*;
public class ID48RotateImage{
	public static void main(String[] args) {
		Solution solution = new ID48RotateImage().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j<matrix.length;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i<matrix.length;i++) {
			for (int j = 0; j < (matrix.length / 2); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - j - 1];
				matrix[i][matrix.length - j - 1] = temp;
			}
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}