package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.*;
public class ID102BinaryTreeLevelOrderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID102BinaryTreeLevelOrderTraversal().new Solution();
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
	private List<List<Integer>> resList =new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
		checkFun01(root,0);
		return resList;
    }

	public void checkFun01(TreeNode node, Integer deep) {
		if (node == null) return;
		deep++;

		if (resList.size() < deep) {
			//当层级增加时，list的Item也增加，利用list的索引值进行层级界定
			List<Integer> item = new ArrayList<Integer>();
			resList.add(item);
		}
		resList.get(deep - 1).add(node.val);

		checkFun01(node.left, deep);
		checkFun01(node.right, deep);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}