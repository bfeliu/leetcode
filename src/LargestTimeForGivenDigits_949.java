public class LargestTimeForGivenDigits_949 {
    private static int[] time = new int[4];
    private static int[] arr = new int[]{0,0,0,0,0,0,0,0,0,0};

    public static String largestTimeFromDigits(int[] A) {
        int invalid=0, validHour=0, validMin=0;
        for(int i=0; i<4; i++){
            arr[A[i]]++;
            if(A[i]>5) invalid++;
        }
        if(invalid>2) return "";

        for(int i=2; i>=0; i--){
            if(arr[i]>0){
                validHour = checkValidHour(i);
                if(validHour==2){
                    for(int j=5; j>=0; j--){
                        if(arr[j]>0){
                            validMin = checkValidMinutes(j);
                            if(validMin==2){
                                return ""+time[0]+time[1]+":"+time[2]+time[3]+"";
                            }
                            else{
                                arr[j]++;
                                arr[time[1]]++;
                                arr[i]++;
                            }
                        }
                    }
                    if(validMin!=2){
                        arr[i]++;
                        arr[time[1]]++;
                    }
                }
                else{
                    arr[i]++;
                }
            }
        }
        return "";
    }

    public static int checkValidHour(int hour1){
        int count=1;
        time[0]=hour1;
        arr[hour1]--;
        if(hour1==2){
            for(int i=3; i>=0; i--){
                if(arr[i]>0){
                    time[1]=i;
                    arr[i]--;
                    count++;
                    break;
                }
            }
        }
        else{
            for(int i=arr.length-1; i>=0; i--){
                if(arr[i]>0){
                    time[1]=i;
                    arr[i]--;
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int checkValidMinutes(int min1){
        int count=1;
        time[2]=min1;
        arr[min1]--;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>0){
                time[3]=i;
                arr[i]--;
                count++;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args){
        //int[] arr = {1,2,3,4}; 
        //int[] arr = {5,5,5,5};
        //int[] arr = {0,0,1,0};
        //int[] arr = {0,4,0,0};
        //int[] arr = {0,0,1,2};
        //int[] arr = {3,0,2,0};
        int[] arr = {2,0,6,6};
        System.out.println(largestTimeFromDigits(arr));                        
        System.out.println("picha grande");
    }
}
