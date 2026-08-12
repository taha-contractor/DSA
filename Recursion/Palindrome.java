class Palindrome {
    public static int reverse(int n, int result){
        if(n==0){
            return result;
        }
        else{
            int digit = n % 10;
            return reverse(n / 10, result * 10 + digit);
        }
    }
    public static void main(String[] args) {
        int n = 12321;
        int result = 0;
        int rev = reverse(n, result);
        if(n == rev){
            System.out.println(n + " is a palindrome.");
        }
        else{
            System.out.println(n + " is not a palindrome.");
        }
    }
}