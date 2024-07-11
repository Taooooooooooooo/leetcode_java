package leetcode.editor.cn;

import java.util.*;
public class ID1047RemoveAllAdjacentDuplicatesInString{
	public static void main(String[] args) {
		Solution solution = new ID1047RemoveAllAdjacentDuplicatesInString().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s) {
		ArrayDeque<Character> deque =new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (deque.isEmpty() || deque.peek() != ch){
				deque.push(ch);
			}else {
				deque.pop();
			}
		}
		String str = "";
		while (!deque.isEmpty()){
			str = deque.pop()+ str;//从 deque 弹出一个元素，并将其添加到字符串 str 的开头
			//str += deque.pop()  从 deque 弹出另一个元素，并将其添加到字符串 str 的结尾。
		}
		return str;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}