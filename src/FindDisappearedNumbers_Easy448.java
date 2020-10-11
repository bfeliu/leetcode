import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers_Easy448 {
    /*
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=nums.length; i++) list.add((Integer)i);
        for(int i=1; i<=nums.length; i++){
            if(list.contains((Integer)nums[i-1])) list.remove((Integer)nums[i-1]);
        }
        return list;
    }*/

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean[] arr = new boolean[nums.length+1];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]] = true;
        }
        for(int i=1; i<arr.length; i++){
            if(!(arr[i])) list.add((Integer)i);
        }
        return list;
    }

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
        System.out.println("Hello World!");
        // System.out.println(1<<4);
    }
}
