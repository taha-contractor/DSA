/*
Leetcode Problem 349: Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 
Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/

import java.util.HashSet;
import java.util.ArrayList;
class IntersectionOfTwoArray {
    public int [] intersection(int[] a, int[] b) {
        HashSet<Integer> sa = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : a) {
            sa.add(num);
        }
        for (int num : b) {
            if (sa.contains(num)) {
                res.add(num);
                sa.remove(num);
            }
        }
        int [] r = new int [res.size()];
        for (int i = 0; i < r.length; i++) {
            r[i] = res.get(i);
        }
        return r;
    }
    
    public static void main(String[] args) {
        IntersectionOfTwoArray obj = new IntersectionOfTwoArray();
        int [] a = {1, 2, 2, 1};
        int [] b = {2, 2};
        int [] res = obj.intersection(a, b);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}