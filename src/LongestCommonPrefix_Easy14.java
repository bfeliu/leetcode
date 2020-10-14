import java.util.HashSet;

public class LongestCommonPrefix_Easy14 {
    // Returns intersections of letters in strings, not only the prefix
    public static String longestCommonPrefixNOOOOO(String[] strs) {
        HashSet<Character> set1 = new HashSet<>();
        for(int i=0; i<strs.length; i++){
            HashSet<Character> set2 = new HashSet<>();
            for(int j=0; j<strs[i].length(); j++){
                set2.add(strs[i].charAt(j));
            }
            if(i==0){
                set1=set2;
            }else{
                set1.retainAll(set2);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : set1) sb.append(c);
        return sb.toString();
    }

    public static String longestCommonPrefix(String[] strs){
        if(strs.length==0) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);
        for(int i=1; i< strs.length; i++) {
            for(int j=0; j<sb.length(); j++){
                if(j<strs[i].length()) {
                    if (sb.charAt(j) != strs[i].charAt(j)) {
                        sb.delete(j, sb.length());
                    }
                }else sb.delete(j, sb.length());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //String[] target = {"flower","flow","flight"};
        //String[] target = {"dog","racecar","car"};
        //String[] target = {};
        //String[] target = {"cir","car"};
        String[] target = {"ab", "a"};
        System.out.println(longestCommonPrefix(target));
        System.out.println("Hello World!");
    }
}
