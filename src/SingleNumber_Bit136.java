public class SingleNumber_Bit136 {
    public static int singleNumber(int[] nums) {
        int sol = nums[0];
        for(int i=1; i<nums.length; i++){
            sol^=nums[i];
        }
        return sol;
    }

    public static void main(String[] args) {

        //int[] arr = {2,2,1};
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
        System.out.println("Hello World!");
        // System.out.println(1<<4);
    }
}
