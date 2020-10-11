import java.util.Arrays;

public class MissingNumer_Easy268 {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
            if(nums[i] != i) break;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {

        //int[] arr = {3,0,1};
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
        System.out.println("Hello World!");
    }
}
