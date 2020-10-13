public class PalindromeNumber_Easy9 {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        return reverse(x) == x;
    }

    public static int reverse(int x){
        long res=x%10;
        x /= 10;
        while(x != 0){
            if((res*10+(x%10)) > Integer.MAX_VALUE || (res*10+(x%10)) < Integer.MIN_VALUE) return 0;
            res= res*10+(x%10);
            x /= 10;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        //int target = -121;
        //int target = 10;
        int target = -101;
        //int target = 121;
        System.out.println(isPalindrome(target));
        System.out.println("Hello World!");
    }
}
