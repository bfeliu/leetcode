import java.util.HashSet;

public class LatestGroupSizeM_1562 {
    public static int findLatestStep(int[] arr, int m) {
        if(arr.length == m) return m;

        int x, y;
        HashSet<Integer> visited = new HashSet<Integer>();
        visited.add(0); visited.add(arr.length+1);

        for(int i=arr.length-1; i>0; i--){
            visited.add(Integer.valueOf(arr[i]));
            x = arr[i] - 1 - m;
            y = arr[i] + 1 + m;

            if(!checkInterrupt(visited, x, arr[i], x)) return i;
            if(!checkInterrupt(visited, arr[i], y, y)) return i;
        }
        return -1;
    }

    public static boolean checkInterrupt(HashSet<Integer> visited, int inf, int sup, int xy){
        if(visited.contains(xy)){
            for(int j=inf + 1; j<= sup-1; j++){
                if(visited.contains(j)) return true;
            }
        }
        else return true;
        return false;
    }

    public static void main(String[] args){
        //int[] arr = {3,5,1,2,4}; int m = 1;
        //int[] arr = {1}; int m = 1;
        //int[] arr = {2,1}; int m=2;
        //int[] arr = {3,1,5,4,2}; int m = 2;
        //int[] arr = {3,2,5,6,10,8,9,4,1,7}; int m = 3;
        //int[] arr = {1,2,3,4}; int m = 1;
        //int[] arr = {4,3,2,1}; int m = 1;
        int[] arr = {10,6,9,4,7,8,5,2,1,3}; int m = 1;
        System.out.println(findLatestStep(arr, m));
        System.out.println("picha grande");
    }
}