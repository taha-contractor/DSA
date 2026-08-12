public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int[] n1 = {1, 1, 2, 2, 3, 4, 4};
        int[] n2 = {1, 1, 1, 1};
        int[] n3 = {1, 2, 3, 4};
        int[] n4 = {5};
        System.out.println("Unique elements in n1: " + removeDuplicates(n1));
        System.out.println("Unique elements in n2: " + removeDuplicates(n2));
        System.out.println("Unique elements in n3: " + removeDuplicates(n3));
        System.out.println("Unique elements in n4: " + removeDuplicates(n4));
    }
}
