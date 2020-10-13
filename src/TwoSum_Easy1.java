import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_Easy1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
                return new int[]{i, map.get(target-nums[i])};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int [] nums = {2,11,7,15}; int target = 9;
        //int [] nums = {3,2,4}; int target = 6;
        //int [] nums = {3,3}; int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println("Hello World!");
    }
}
