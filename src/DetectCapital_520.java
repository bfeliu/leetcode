public class DetectCapital_520 {
    public static boolean detectCapitalUse2(String word) {
        String original = word;
        if(word.toUpperCase().equals(original)) return true;
        if(word.toLowerCase().equals(original)) return true;
        if(word.substring(0, 1).toUpperCase().concat(word.substring(1).toLowerCase()).equals(original)) return true;
        return false;
    }

    public static boolean detectCapitalUse(String word) {
        if(word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+")) return true;
        return false;
    }

    public static void main(String[] args){
        String word = "usa";
        System.out.println(detectCapitalUse(word));                        
        System.out.println("picha grande");
    }
}