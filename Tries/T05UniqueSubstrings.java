public class T05UniqueSubstrings{

    @SuppressWarnings("unused")
    static class Node{
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

    private static void findSuffixes(String str){
        int n = str.length();
        for(int i = 0; i< n; i++){
           String  suffix = str.substring(i);
           insert(suffix);
        }
    }

    private static int uniquePrefixes(Node root){

        if(root == null){
            return 0;
        }

        int count = 0;

        for(int i = 0; i<26; i++){
            if(root.children[i]!= null){
                count += uniquePrefixes(root.children[i]);
            }
        }

        return count + 1;
    }

    public static int uniqueSubstrings(String str){
        findSuffixes(str);


        int count = uniquePrefixes(root);

        return count; 

    }

    public static void main(String[] args) {
        String words = "ababa";
        System.out.println(uniqueSubstrings(words));

    }

}