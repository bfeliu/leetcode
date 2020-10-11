
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static int rob(int[] nums) {
        int[] money = new int[]{0,0};
        for(int i=0; i<nums.length; i++){
            if(i%2==0) money[0] += nums[i];
            else money[1] += nums[i];
        }
        return (money[0]>money[1]) ? money[0] : money[1];
    }

    public static void main(String[] args) {
        //int [] nums = {1,2,3,1};
        //int [] nums = {2,7,9,3,1};
        int [] nums = {2,1,1,2};
        //System.out.println(rob(nums));
        System.out.println("Hello World!");
    }
}
