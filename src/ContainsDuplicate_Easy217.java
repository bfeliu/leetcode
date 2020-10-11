import java.util.HashSet;

public class ContainsDuplicate_Easy217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(new Integer(nums[i]))) return true;
            set.add(new Integer(nums[i]));
        }
        return false;
    }

    public static void main(String[] args) {

        //int[] arr = {1,2,3,1};
        int[] arr = {1,2,3,4};
        //int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
        System.out.println("Hello World!");
    }
}
