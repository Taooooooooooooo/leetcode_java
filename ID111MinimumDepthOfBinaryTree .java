package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.*;
public class ID111MinimumDepthOfBinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID111MinimumDepthOfBinaryTree().new Solution();
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
    public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = minDepth(root.left);
		int rightDepth = minDepth(root.right);
		if (root.left == null) {
			return rightDepth + 1;
		}
		if (root.right == null) {
			return leftDepth + 1;
		}
		return Math.min(leftDepth, rightDepth) + 1;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}