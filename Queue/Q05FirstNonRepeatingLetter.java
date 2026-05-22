
import java.util.LinkedList;
import java.util.Queue;

public class Q05FirstNonRepeatingLetter{

    public static char[] firstNonRepeating(String str){
        char[] res = new char[str.length()];
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);            
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty()&&freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                res[i] = '0';
            }else
            {res[i] = q.peek();}
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        char[] res = firstNonRepeating(str);

        for(int i = 0; i< res.length; i++){
            System.out.print(res[i]+ " ");
        }
        
    }
}