
import java.util.Stack;

public class SK08ValidParenthesis{

    public static boolean isValidParenthesis(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i< str.length()-1;i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[' ){
                s.push(ch);
            }else{
                if(ch == ')' && s.peek() == '('){
                    s.pop();
                }else if(ch == '}' && s.peek() == '{'){
                    s.pop();
                }else if(ch == ']' && s.peek() == '['){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "{({[]})([])}";
        System.out.println(isValidParenthesis(str));
    }
}