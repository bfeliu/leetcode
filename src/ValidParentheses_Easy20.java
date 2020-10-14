import java.util.Stack;

public class ValidParentheses_Easy20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            switch (s.charAt(i)){
                case ')':
                    if(!stack.empty()) {
                        if (stack.pop() != '(') return false;
                    }else
                        stack.push(s.charAt(i));
                    break;
                case ']':
                    if(!stack.empty()){
                        if(stack.pop() != '[') return false;
                    }else
                        stack.push(s.charAt(i));
                    break;
                case '}':
                    if(!stack.empty()){
                        if(stack.pop() != '{') return false;
                    }else
                        stack.push(s.charAt(i));
                    break;
                default:
                    stack.push(s.charAt(i));
                    break;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        //String target = "{[]}";
        //String target = "([)]";
        //String target = "(]";
        //String target = "()[]{}";
        String target = "]";
        System.out.println(isValid(target));
        System.out.println("Hello World!");
    }
}
