
import java.util.Stack;

public class SK09DuplicateParenthesis{

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length();i++){
            int count = 0;
            char ch = str.charAt(i);

            if(ch==')'){
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                s.pop();
                if(count<1){
                    return true;
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str  = "(a+(b))+((a+(c-d)+a))";
        System.out.println(isDuplicate(str));

        System.out.println(isDuplicate("((a+b)+(c+d))"));
    }
}