package leetcode.editor.cn;

import java.util.*;
public class ID20ValidParentheses{
	public static void main(String[] args) {
		Solution solution = new ID20ValidParentheses().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(') {
				deque.push(')');
			}else if (ch == '{') {
				deque.push('}');
			}else if (ch == '[') {
				deque.push(']');
			}else if (deque.isEmpty() || deque.peek() != ch) {
				return false;
			}
			else {deque.pop();}
		}
		return deque.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}