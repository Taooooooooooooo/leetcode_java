package leetcode.editor.cn;

import java.util.*;
public class ID151ReverseWordsInAString{
	public static void main(String[] args) {
		Solution solution = new ID151ReverseWordsInAString().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {

		// 1.去除首尾以及中间多余空格
		StringBuilder sb = removeSpace(s);
		// 2.反转整个字符串
		reverseString(sb, 0, sb.length() - 1);
		// 3.反转各个单词
		reverseEachWord(sb);
		return sb.toString();


    }

	private StringBuilder removeSpace(String s){
		int start = 0;
		int end = s.length()-1;
		while (s.charAt(start) == ' '){start++;}
		while (s.charAt(end) == ' '){end--;}
		StringBuilder sb = new StringBuilder();
		while (start<=end){
			char c = s.charAt(start);
			// 去除字符串中间多余的空格。保留一个空格
			if(c != ' ' || (!sb.isEmpty() && sb.charAt(sb.length()-1) != ' ')){
				sb.append(c);
			}
			start++;
		}
		return sb;
	}

	public void reverseString(StringBuilder sb, int start, int end) {

		while (start < end) {
			char temp = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, temp);
			start++;
			end--;
		}
	}

	private void reverseEachWord(StringBuilder sb) {
		int start = 0;
		int end = 0;
		int n = sb.length();
		while (start < n) {
			while (end < n && sb.charAt(end) != ' ') {
				end++;
			}
			reverseString(sb, start, end - 1);
			start = end + 1;
			end = start;
		}
	}

}
//leetcode submit region end(Prohibit modification and deletion)

}