package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.*;
public class ID101SymmetricTree{
	public static void main(String[] args) {
		Solution solution = new ID101SymmetricTree().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return Compare(root.left,root.right);
    }

	private boolean Compare(TreeNode left, TreeNode right){
		if (left == null && right != null) {
			return false;
		}
		if (left != null && right == null) {
			return false;
		}

		if (left == null && right == null) {
			return true;
		}
		if (left.val != right.val) {
			return false;
		}
		// 比较外侧
		boolean compareOutside = Compare(left.left, right.right);
		// 比较内侧
		boolean compareInside = Compare(left.right, right.left);
        return compareOutside && compareInside;
	}


}
//leetcode submit region end(Prohibit modification and deletion)

}