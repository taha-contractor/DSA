import java.util.Arrays;
public class MovesZeros {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j<nums.length; j++){
            if (nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        while (i < nums.length){
            nums[i] = 0;
            i++;
        }
        System.out.println("Array after moving zeros: "+ Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] n = {0, 1, 0, 3, 12};
        moveZeroes(n);
    }
}
