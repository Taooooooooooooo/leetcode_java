package leetcode.editor.cn;

import java.util.*;
public class ID17LetterCombinationsOfAPhoneNumber{
	public static void main(String[] args) {
		Solution solution = new ID17LetterCombinationsOfAPhoneNumber().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> letterCombinations(String digits) {
		// 如果输入为空，返回空列表
		if (digits == null || digits.isEmpty()) {
			return new ArrayList<>();
		}
		// 创建数字到字母的映射
		HashMap<Character,char[]> map = new HashMap<>();
		map.put('2',new char[] {'a','b','c'});
		map.put('3',new char[] {'d','e','f'});
		map.put('4', new char[] {'g', 'h', 'i'});
		map.put('5', new char[] {'j', 'k', 'l'});
		map.put('6', new char[] {'m', 'n', 'o'});
		map.put('7', new char[] {'p', 'q', 'r', 's'});
		map.put('8', new char[] {'t', 'u', 'v'});
		map.put('9', new char[] {'w', 'x', 'y', 'z'});

	}
}
//leetcode submit region end(Prohibit modification and deletion)

}