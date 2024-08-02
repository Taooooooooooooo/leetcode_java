package leetcode.editor.cn;

import java.util.*;
public class ID455AssignCookies{
	public static void main(String[] args) {
		Solution solution = new ID455AssignCookies().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
		Arrays.sort(s);
		int result = 0;
		int index = s.length-1;
        for (int j=g.length-1; j>=0; j--) {
            if (index >= 0 && s[index] >= g[j]) {
				index--;
				result++;
            }
        }
		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}