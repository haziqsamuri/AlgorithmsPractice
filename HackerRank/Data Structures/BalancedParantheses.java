import java.util.Stack;

public class Solution{
    public static char[][] TOKENS = {{'{','}'}, {'[',']'}, {'(',')'}};

    public static boolean isOpenTerm(char c){
        for(char[] array : TOKENS){
            if(array[0] == c){
                return true;
            }
        }
        return false;
    }

    public static boolean matches(char openTerm, char closeTerm){
        for(char[] array : TOKENS){
            if(array[0] == openTerm && array[1] == closeTerm){
                return true;
            }
        }
        return false;
    }

    public static boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<Character>();
        for(char c : expression.toCharArray()){
            if(isOpenTerm(c)){
                stack.push(c);
            }
            else{
                char top = stack.pop();
                if(stack.isEmpty() || (!matches(top, c))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}