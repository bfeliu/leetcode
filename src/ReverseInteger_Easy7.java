public class ReverseInteger_Easy7 {
    public static int reverse(int x) {
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
        //int target = 123;
        //int target = -123;
        //int target = 120;
        //int target = 0;
        int target = 1534236469;
        System.out.println(reverse(target));
        System.out.println("Hello World!");
    }
}
