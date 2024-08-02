package leetcode.editor.cn;

import java.util.*;
public class ID77Combinations{
	public static void main(String[] args) {
		Solution solution = new ID77Combinations().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
		List<List<Integer>> result = new ArrayList<>();
		LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
		Backtracking(n,k,1);
		return result;

    }

	private void Backtracking(int n ,int k, int startIndex){
		if (path.size() == k){
			result.add(new ArrayList<>(path));
			return;
		}
		for(int i = startIndex; i<=n-(k-path.size())+1; i++){
			path.add(i);
			Backtracking(n,k,i+1);
			path.removeLast();
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}