public class ContainsNearbyAlmostDuplicate_220 {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums.length<2) return false;

        for(int i=0; i<nums.length; i++){
            for(int j=1; (j<=k && i+j<nums.length); j++){
                if(Math.abs((double)nums[i]-nums[i+j])<=t) return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        //int[] arr = {1,2,3,1}; int k=3, t=0;
        //int[] arr = {1,0,1,1}; int k=1, t=2;
        //int[] arr = {1,5,9,1,5,9}; int k=2, t=3;
        int[] arr={-1,2147483647}; int k=1; int t=2147483647;
        System.out.println(containsNearbyAlmostDuplicate(arr, k, t));                        
        System.out.println("picha grande");
    }
}
