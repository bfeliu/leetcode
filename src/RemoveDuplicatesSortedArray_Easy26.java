public class RemoveDuplicatesSortedArray_Easy26 {
    public static int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1] && j<nums.length){
                nums[j]=nums[i+1];
                j++;
            }
        }
        return (nums.length>0) ? j : 0;
    }

    public static void main(String[] args) {
        //int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println("Hello World!");
    }
}
