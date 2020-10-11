public class RepeatedSubstringPattern_459 {
    public static boolean repeatedSubstringPattern(String s) {
        int substringLength=0;
        String sub, s2;
        for(int i=2; i<=s.length(); i++){
            if(s.length()%i == 0){
                s2="";
                substringLength = (s.length()/i);
                sub = s.substring(0, substringLength);
                for(int j=0; j<i; j++){
                    s2+=sub;
                }
                if(s2.equals(s)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        //String s = "ababab";
        //String s = "aba";
        //String s = "abcabcabcabc";
        //String s="bb";
        //String s="aabaaba";
        String s= "ababababab";
        System.out.println(repeatedSubstringPattern(s));                        
        System.out.println("picha grande");
    }
}
