package leetcode.editor.cn;

import javax.swing.tree.TreeNode;
import java.util.*;
public class ID145BinaryTreePostorderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID145BinaryTreePostorderTraversal().new Solution();
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
		postOrder(root,result);
		return result;
    }
	public void postOrder(TreeNode root,List<Integer> list){
		if (root == null){
			return;
		}
		postOrder(root.left, list);
		postOrder(root.right,list);
		list.add(root.val);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}