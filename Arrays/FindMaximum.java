class FindMaximum {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] n1 = {7, 2, 9, 4, 1};
        int[] n2 = {-5, -10, -2, -8};
        int[] n3 = {5};
        System.out.println("Maximum in n1: " + findMax(n1));
        System.out.println("Maximum in n2: " + findMax(n2));
        System.out.println("Maximum in n3: " + findMax(n3));
    }
}