public class R06RemoveDuplicateString{

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map){
        if(idx == str.length()-1){
            System.out.println(newStr);
            return;
        }
        if(str.charAt(idx)==' '){
            newStr.append(' ');
        }else if(map[str.charAt(idx)-'a']==false){
            newStr.append(str.charAt(idx));
            map[str.charAt(idx)-'a'] = true;
        }
        removeDuplicates(str, idx+1, newStr, map);
    }

    public static void main(String[] args) {
        String str = "hhhelloo woorlddd";
        removeDuplicates(str, 0,new StringBuilder(""), new boolean[26]);

    }
}