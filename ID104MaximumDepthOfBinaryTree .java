package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.*;
public class ID104MaximumDepthOfBinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID104MaximumDepthOfBinaryTree().new Solution();
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
    public int maxDepth(TreeNode root) {
        if (root == null){
			return 0;
		}
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		return Math.max(leftDepth,rightDepth)+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}