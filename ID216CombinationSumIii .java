package leetcode.editor.cn;

import java.util.*;
public class ID216CombinationSumIii{
	public static void main(String[] args) {
		Solution solution = new ID216CombinationSumIii().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
		List<List<Integer>> result = new ArrayList<>();
		LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
		Backtracking(k,n,0,1);
		return result;
    }

	private void Backtracking(int k, int n, int sum, int startIndex){
		if (sum > n){return;}
		if (path.size() > k ){return;}
		if (path.size()==k){
			if (sum == n){
				result.add(new LinkedList<>(path));
				return;
			}
		}
		for (int i = startIndex;i<=9;i++){
			path.add(i);
			Backtracking(k,n,i+sum,i+1);
			path.removeLast();
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}