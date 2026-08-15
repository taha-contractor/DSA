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