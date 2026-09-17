/* LeetCode Problem 136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one. You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

Constraints:
1 <= nums.length <= 3 * 10^4
-3 * 10^4 <= nums[i] <= 3 * 10^4
Only one element appears once. */

class SingleNum {
    public int singleNumber(int[] nums){
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        SingleNum sn = new SingleNum();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(sn.singleNumber(nums));
    }
}