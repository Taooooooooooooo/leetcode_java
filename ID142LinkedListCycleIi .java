package leetcode.editor.cn;

import java.util.*;
public class ID142LinkedListCycleIi{
	public static void main(String[] args) {
		Solution solution = new ID142LinkedListCycleIi().new Solution();
		StringBuilder sb = new StringBuilder();

		//执行测试

		System.out.println(sb);
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) {
				ListNode index1 = fast;
				ListNode index2 = head;
				while (index1 != index2) {
					index1 = index1.next;
					index2 = index2.next;
				}
				return index1;
			}
		}
		return null;
	}
}

//leetcode submit region end(Prohibit modification and deletion)

}