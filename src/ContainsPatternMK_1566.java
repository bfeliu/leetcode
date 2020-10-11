public class ContainsPatternMK_1566 {
    public static boolean containsPattern(int[] arr, int m, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(count==0 && (arr.length-i)<(m*k)) break;
            for (int j = 0; j < k; j++) {
                if (arr[i] != arr[i + j * m]) {
                    count = 0;
                    break;
                }
                count++;
                if (count == m * k)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,2,1,2,1,3}; int m=2, k=3;
        //int[] arr = {1,2,4,4,4,4}; int m=1, k=3;
        //int[] arr = {4,4,4,4,1}; int m=1, k=4;
        //int[] arr = {2,2}; int m=1, k=2;
        System.out.println(containsPattern(arr, m, k));                        
        System.out.println("picha grande");
    }
}