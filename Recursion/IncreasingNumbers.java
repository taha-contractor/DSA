class IncreasingNumbers {
    public static void printIncreasing(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printIncreasing(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        printIncreasing(n);
    }
}