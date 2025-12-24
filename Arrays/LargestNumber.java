/* LeetCode Problem 179. Largest Number 
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it. Since the result may be very large, so you need to return a string instead of an integer.

Example 1:
Input: nums = [10,2]
Output: "210"

Example 2:
Input: nums = [3,30,34,5,9]
Output: "9534330"

Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 10*9 */

package Arrays;
import java.util.Arrays;
import java.util.Comparator;
class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 22, 68, 90};
        int n = nums.length;
        String [] element = new String[n];
        // Step 1: Conversion in String
        for (int i = 0; i < n; i++) {
            element[i] = String.valueOf(nums[i]);
        }
        // Step 2: Logic For Sorting
        Arrays.sort(element, new Comparator<String>() {
            public int compare(String a, String b) {
                String First = a + b;
                String Second = b + a;
                return Second.compareTo(First);
            }                
        });
        // Step 3: Resultant String
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(element[i]);
        }
        // Edge Case : when all are zeroes
        if (result.charAt(0) == '0') {
            System.out.println("0");
        } else {
            System.out.println(result.toString());
        }
    }
}