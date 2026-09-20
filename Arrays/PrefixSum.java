class PrefixSum {
    public static int[] prefixSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }
    public static int rangeSum(int []]prefix, int L, int R) {
        int sum = 0;
        for (int i = 0; i < prefix.length; i++) {
            if (L == 0) {
                sum = prefix[R];
            }
            else {
                sum = prefix[R] - prefix[L-1]
            }
        }
        return sum;
    }
    public static void main()
}