
public class Main {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                j++;
            }else{
                nums[j]=nums[i+1];
            }
        }
        return (nums.length>0) ? j : 0;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3}; int val=3;
        //int[] nums = {0,1,2,2,3,0,4,2}; int val=2;
        System.out.println(removeElement(nums, val));
        System.out.println("Hello World!");
    }


    /*

    public static String findLexSmallestString(String s, int a, int b){
        return "";
    }

    private static String rotate(String s, int b){
        s.
        return s;
    }

    private static String add(String s, int a){
        int newVal;
        for(int i=1; i<s.length(); i+=2){
            newVal=((int)s.charAt(i)+a)%10;
            s= s.substring(0,i-1) + Integer.toString(newVal) + s.substring(i, s.length());
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "5525"; int a = 9, b = 2;
        //String s = "74"; int a = 5, b = 1;
        //String s = "0011"; int a = 4, b = 2;
        //String s = "43987654"; int a = 7, b = 3;
        //System.out.println(findLexSmallestString(s,a,b));
        System.out.println(add(s, 9));
    }*/
}
