/*
Problem: Range Sum Queries

You are given an integer array nums and two indices L and R. Your task is to find the sum of all elements from index L to index R, inclusive, using the Prefix Sum technique.

Example
Input: nums = [2, 7, 3, 6, 1]
L = 1
R = 3
The required range is:
Index:  0   1   2   3   4
        2   7   3   6   1
            └───────┘

So:
7 + 3 + 6 = 16
Output 16

Example 2 — Special Case
Input: nums = [5, 2, 8, 3, 4]
L = 0
R = 3
Required: 5 + 2 + 8 + 3 = 18
Output: 18
*/

class PrefixSum {
    public static int[] prefixSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }
    public static int rangeSum(int [] prefix, int L, int R) {
        int sum = 0;
        for (int i = 0; i < prefix.length; i++) {
            if (L == 0) {
                sum = prefix[R];
            }
            else {
                sum = prefix[R] - prefix[L-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] nums = {1, 5, 7, 10, 12};
        int L = 1;
        int R = 3;
        int [] prefix = new int [nums.length];
        prefix = prefixSum(nums);
        int sum = rangeSum(prefix, L, R);
        System.out.println("Range Sum from "+ L +" to "+ R +" is : "+ sum);
    }
}