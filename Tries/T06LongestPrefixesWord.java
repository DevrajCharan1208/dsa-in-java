public class T06LongestPrefixesWord{

    @SuppressWarnings("unused")
    public static class Node{
        public Node children[] = new Node [26];
        boolean eow = false;

        Node(){
            for(int i= 0; i<26; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    public static void insert (String word){
        Node curr = root;
        for(int level = 0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level = 0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow;
    }

    static String ans = "";
    public static String longestWord(Node root){
        StringBuilder temp = new StringBuilder("");

        longestHelper(root, temp);

        return ans;
    }

    private static void longestHelper(Node root, StringBuilder temp){
        if(root == null){
            return;
        }

        for(int i = 0; i< 26; i++){
            if(root.children[i]!=null&&root.children[i].eow == true){
                char ch = (char) (i + 'a');
                temp.append(ch);
                if(temp.length()>ans.length()){
                    ans = temp.toString();
                }
                longestHelper(root.children[i], temp);
                //backtrack
                temp.deleteCharAt(temp.length()-1);

            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"a","banana","app","appl","ap","apply","apple"};

        for (String word : words) {
            insert(word);
        }

        System.out.println(longestWord(root));

    }

}