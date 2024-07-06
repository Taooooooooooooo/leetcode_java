package leetcode.editor.cn;

import java.util.*;
public class ID19RemoveNthNodeFromEndOfList{
	public static void main(String[] args) {
		Solution solution = new ID19RemoveNthNodeFromEndOfList().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1,head);
		ListNode fastIndex = dummyNode;
		ListNode slowIndex = dummyNode;
		for (int i=0;i<= n;i++){
			fastIndex = fastIndex.next;
		}
		while (fastIndex != null){
			fastIndex = fastIndex.next;
			slowIndex = slowIndex.next;
		}
		if (slowIndex.next != null){
			slowIndex.next = slowIndex.next.next;
		}
		return dummyNode.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}