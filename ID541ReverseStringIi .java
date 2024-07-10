package leetcode.editor.cn;

import java.util.*;
public class ID541ReverseStringIi{
	public static void main(String[] args) {
		Solution solution = new ID541ReverseStringIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseStr(String s, int k) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i+=2*k) {
			int start = i;
			int end = Math.min(ch.length - 1, start + k - 1);
			while (start < end) {
				ch[start] ^= ch[end];
				ch[end] ^= ch[start];
				ch[start] ^= ch[end];
				start++;
				end--;
			}
		}
		return new String(ch);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}