package leetcode;

public class Squares_of_a_Sorted_Array_977 {

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        Squares_of_a_Sorted_Array_977 Sorted = new Squares_of_a_Sorted_Array_977();

        int[] result = Sorted.sortedSquares(nums);
        System.out.print("[");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(i<result.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }




    public int[] sortedSquares(int[] nums) {
        int[] result = new int [nums.length];  //ArrayList<Integer> result = new ArrayList<>(); 动态数组结构
        int k = nums.length-1;
        for (int i = 0,j = nums.length-1;i <= j;) {
            if (nums[i]*nums[i]>nums[j]*nums[j]){
                result[k] = nums[i]*nums[i];
                i++;
            }else {
                result[k]=nums[j]*nums[j];
                j--;
            }
            k--;

        }
        return result;
    }
}

// for (int i = 0,int j = nums.length-1;i <= j)    for (int i = 0,j = nums.length-1;i <= j;)
//你试图在同一个 for 循环的初始化部分中声明两个变量，并分别给它们一个类型声明 int。这在 Java 中是不合法的，因为在 for 循环的初始化部分中不能有多个类型声明。
//在这个 for 循环中：
//
//初始化部分：int i = 0, j = nums.length - 1 初始化了两个变量 i 和 j。
//条件部分：i <= j 是循环继续执行的条件。
//迭代部分：在这里省略了常规的迭代部分 i++ 或 j--，因为它们在循环体内根据条件分别进行。
//注意 for 循环的三个部分之间的分号是必需的，即使迭代部分为空。