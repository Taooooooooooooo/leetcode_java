package leetcode.editor.cn;

import java.util.*;
public class ID40CombinationSumIi{
	public static void main(String[] args) {
		Solution solution = new ID40CombinationSumIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
		List<List<Integer>> result = new ArrayList<>();
		LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		Backtracking(candidates,target,0,0);
		return result;
    }

	private void Backtracking(int[] candidates, int target,int sum,int startIndex){
		if(sum>target){return;}
		if (sum == target){
			result.add(new LinkedList<>(path));
		}


		for (int i = startIndex;i<candidates.length;i++){
			if (i > startIndex && candidates[i] == candidates[i - 1]) {
				continue;
			}
			path.add(candidates[i]);
			sum += candidates[i];
			Backtracking(candidates,target,sum,i+1);
			sum -= candidates[i];
			path.removeLast();
		}



	}

}
//leetcode submit region end(Prohibit modification and deletion)

}