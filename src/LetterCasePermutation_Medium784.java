import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation_Medium784 {
    private static List<String> list = new ArrayList<String>();

    public static List<String> letterCasePermutation(String S) {
        StringBuilder sb = new StringBuilder();
        permut(S, sb);
        return list;
    }

    private static void permut(String s, StringBuilder sb){
        if(s.equals("")){
            list.add(sb.toString());
        }
        else if(Character.isLetter(s.charAt(0))){
            permut(s.substring(1), sb.append(Character.toLowerCase(s.charAt(0))));
            sb.setLength(sb.length()-1);
            permut(s.substring(1), sb.append(Character.toUpperCase(s.charAt(0))));
            sb.setLength(sb.length()-1);
        }
        else{
            permut(s.substring(1), sb.append(s.charAt(0)));
            sb.setLength(sb.length()-1);
        }
    }


    /*
    class Solution {
    private List<String> list = new ArrayList<String>();
    public List<String> letterCasePermutation(String S) {
        permut(S, "");
       return list;
    }

    private void permut(String s, String first){
        if(s.equals("")){
            list.add(first);
        }
        else if(Character.isLetter(s.charAt(0))){
            permut(s.substring(1), first + Character.toLowerCase(s.charAt(0)));
            permut(s.substring(1), first + Character.toUpperCase(s.charAt(0)));
        }
        else{
            permut(s.substring(1), first + s.charAt(0));
        }
    }
    }

     */


    public static void main(String[] args) {

        String s = "a1b2";
        //String s = "3z4";
        //String s = "12345";
        //String s = "0";
        System.out.println(letterCasePermutation(s));
        System.out.println("Hello World!");
        // System.out.println(1<<4);
    }
}
