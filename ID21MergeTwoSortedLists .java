package leetcode.editor.cn;

import java.util.*;
public class ID21MergeTwoSortedLists{
	public static void main(String[] args) {
		Solution solution = new ID21MergeTwoSortedLists().new Solution();
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		} else if (list2 == null ) {
			return list1;
		}

		ListNode start = new ListNode(-1); // 临时起始节点
		ListNode curr = start;

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				curr.next = list1;
				list1 = list1.next;
			} else {
				curr.next = list2;
				list2 = list2.next;
			}
			curr = curr.next;
		}

		// 直接连接剩余的节点
		if (list1 != null) {
			curr.next = list1;
		} else {
			curr.next = list2;
		}
		return start.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}