package leetcode.editor.cn;

import java.util.*;
public class ID239SlidingWindowMaximum{
	public static void main(String[] args) {
		Solution solution = new ID239SlidingWindowMaximum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length == 1) {
			return nums;
		}
		int len = nums.length - k + 1;
		//存放结果元素的数组
		int[] res = new int[len];
		int num = 0;
		MyQueue myQueue = new MyQueue();
		for (int i = 0; i < k; i++) {
			myQueue.add(nums[i]);
		}
		res[num++] = myQueue.peek();
		for (int i = k; i < nums.length; i++) {

			myQueue.poll(nums[i-k]);

			myQueue.add(nums[i]);
			res[num++] = myQueue.peek();
		}
		return res;
    }
}
class MyQueue{
		Deque<Integer> deque = new LinkedList<>();
		void poll(int val){
			if (! deque.isEmpty() && val == deque.peek()){
				deque.poll();
			}
		}

		void add(int val){
			while (! deque.isEmpty() && val > deque.getLast()){
				deque.removeLast();
			}
			deque.add(val);
		}
		public int peek(){
			return deque.peek();
	}

}



//leetcode submit region end(Prohibit modification and deletion)

}