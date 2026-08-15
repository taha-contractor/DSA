import java.util.HashMap;
import java.util.Map;
public class FindSum {
    public static int[  ] findSum(int[] arr, int target){
        Map<Integer, Integer>seen = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (seen.containsKey(comp)) {
                return new int[]{seen.get(comp), i};
            }
            seen.put(arr[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = findSum(arr, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
    }
}