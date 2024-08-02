package leetcode.editor.cn;

import java.util.*;
public class ID39CombinationSum{
	public static void main(String[] args) {
		Solution solution = new ID39CombinationSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	List<List<Integer>> result = new ArrayList<>();
	LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTracking(candidates,target,0,0);
		return result;
    }

	private void backTracking(int[] candidates, int target, int sum, int startIndex){
		if (sum > target){return;}
		if (sum == target){
			result.add(new ArrayList<>(path));
			return;
		}

		for(int i = startIndex; i < candidates.length; i++ ){
			path.add(candidates[i]);
			backTracking(candidates,target,sum+candidates[i],i);
			path.removeLast();
		}

	}


}
//leetcode submit region end(Prohibit modification and deletion)

}