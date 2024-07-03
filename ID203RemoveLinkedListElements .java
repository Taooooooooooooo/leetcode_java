package leetcode.editor.cn;

import java.util.*;
public class ID203RemoveLinkedListElements{
	public static void main(String[] args) {
		Solution solution = new ID203RemoveLinkedListElements().new Solution();
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
    public ListNode removeElements(ListNode head, int val) {
       if (head == null){
	   	return head;}

	   ListNode dummy = new ListNode(-1,head);
	   dummy.next = head;
		ListNode cur = dummy;
		while (cur.next != null) {
			if (cur.next.val == val) {
				cur.next = cur.next.next;
			}else {cur=cur.next;}
		}
		return dummy.next;


	}
}
//leetcode submit region end(Prohibit modification and deletion)

}