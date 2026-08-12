class Reverse{
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
        int n = 12345;
        int result = 0;
        System.out.println("The reverse of " + n + " is: "+reverse(n, result));
    }
}