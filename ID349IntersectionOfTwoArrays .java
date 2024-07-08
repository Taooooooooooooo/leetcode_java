package leetcode.editor.cn;

import java.util.*;
public class ID349IntersectionOfTwoArrays{
	public static void main(String[] args) {
		Solution solution = new ID349IntersectionOfTwoArrays().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
			return new int[0];
		}
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
        for (int j : nums1) {
            set1.add(j);
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }

		return set2.stream().mapToInt(x -> x).toArray();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}