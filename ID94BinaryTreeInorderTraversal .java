package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.*;
public class ID94BinaryTreeInorderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID94BinaryTreeInorderTraversal().new Solution();
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
		inOrder(root,result);
		return result;
    }
	public void inOrder(TreeNode root,List<Integer> list){
		if (root == null){
			return;
		}
		inOrder(root.left, list);
		list.add(root.val);
		inOrder(root.right, list);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}