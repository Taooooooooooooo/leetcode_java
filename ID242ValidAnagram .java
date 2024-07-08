package leetcode.editor.cn;

import java.util.*;
public class ID242ValidAnagram{
	public static void main(String[] args) {
		Solution solution = new ID242ValidAnagram().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
		int [] record = new int[26];
		// for (int i = 0; i < s.length(); i++) {record[s.charAt(i)-'a']++;}
		s.chars().forEach(c -> record[c-'a']++);
		t.chars().forEach(c -> record[c-'a']--);
        for (int j : record) {
            if (j != 0) {
                return false;
            }
        }
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}