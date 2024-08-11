public class CountUniqueSubstring {
    static class Node{
        Node [] children;
        boolean end;

        public Node(){
            children = new Node[26];
            for(int i = 0; i<26; i++){
                children[i] = null;
            }
            end =false;
        }
    }
    static Node root = new Node();

    //insert
    public static void insert(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1){
                curr.children[idx].end = true;
            }

            curr = curr.children[idx];
        }
    }

    //search
    public static boolean search(String key) {
        Node curr = root;
        for(int i = 0; i < key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            if(i == key.length()-1 && curr.children[idx].end == false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static int countSubstring(Node root) {
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(root.children[i] != null){
                count += countSubstring(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String args []){
        String str = "apple";
        for(int i = 0; i < str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countSubstring(root));

    }
}
