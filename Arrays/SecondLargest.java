public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = 0;
        boolean foundSecond = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                foundSecond = true;
            } else if (arr[i] < largest) {
                if (!foundSecond || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                    foundSecond = true;
                }
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] n1 = {10, 5, 20, 8, 20, 15};
        int[] n2 = {5, 5, 5};
        int[] n3 = {10};
        int[] n4 = {-5, -10, -2};
        System.out.println("Second largest in n1: " + findSecondLargest(n1));
        System.out.println("Second largest in n2: " + findSecondLargest(n2));
        System.out.println("Second largest in n3: " + findSecondLargest(n3));
        System.out.println("Second largest in n4: " + findSecondLargest(n4));
    }    
}