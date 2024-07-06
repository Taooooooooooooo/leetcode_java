package leetcode.editor.cn;

import java.util.*;
public class ID24SwapNodesInPairs{
	public static void main(String[] args) {
		Solution solution = new ID24SwapNodesInPairs().new Solution();
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
    public ListNode swapPairs(ListNode head) {
		ListNode dummy_head = new ListNode(-1,head);
		ListNode cur = dummy_head;
		while(cur.next != null && cur.next.next != null ){
			ListNode temp1 = cur.next;
			ListNode temp2 = cur.next.next.next;
			cur.next = cur.next.next;
			cur.next.next = temp1;
			temp1.next = temp2;
			cur =cur.next.next;
		}
		return dummy_head.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}