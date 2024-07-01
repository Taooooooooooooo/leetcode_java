package leetcode;
//704. Binary Search
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//
//You must write an algorithm with O(log n) runtime complexity.

//Example 1:
//
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
//Example 2:
//
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1


import java.util.ArrayList;

public class Binary_Search_704 {


    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        int result = search(nums, target);
        System.out.println(result);

    }
    public static int search(int[] nums,int target){
        int l = 0;
        int r = nums.length-1;

        while (l<=r){
           int m = (l+r)>>>1;
           if (nums[m]>target){
               r = m-1;
           }else if(nums[m]<target){
               l = m+1;
           }else return m;
        }
        return -1;

    }

}


//您需要先创建该类的实例，然后通过实例来调用search方法，或者将search方法声明为静态方法以便在静态上下文（如main方法）中直接调用。要修复此问题，您有两个选择：
//将search方法声明为静态方法：
//将search方法声明为静态方法，使其可以在main方法中直接调用

//public class Binary_Search_704 {
//
//    public static void main(String[] args) {
//        int[] nums = {-1, 0, 3, 5, 9, 12};
//        int target = 9;
//
//        int result = search(nums, target);
//        System.out.println(result);
//    }
//
//    public static int search(int[] nums, int target) {
//        int l = 0;
//        int r = nums.length - 1;
//
//        while (l <= r) {
//            int m = (l + r) >>> 1;
//            if (nums[m] > target) {
//                r = m - 1;
//            } else if (nums[m] < target) {
//                l = m + 1;
//            } else {
//                return m;
//            }
//        }
//        return -1;
//    }
//}

//通过类的实例来调用search方法：
//
//创建类的实例，通过实例来调用search方法。

//public class Binary_Search_704 {
//
//    public static void main(String[] args) {
//        int[] nums = {-1, 0, 3, 5, 9, 12};
//        int target = 9;
//
//        Binary_Search_704 binarySearch = new Binary_Search_704();
//        int result = binarySearch.search(nums, target);
//        System.out.println(result);
//    }
//
//    public int search(int[] nums, int target) {
//        int l = 0;
//        int r = nums.length - 1;
//
//        while (l <= r) {
//            int m = (l + r) >>> 1;
//            if (nums[m] > target) {
//                r = m - 1;
//            } else if (nums[m] < target) {
//                l = m + 1;
//            } else {
//                return m;
//            }
//        }
//        return -1;
//    }
//}



