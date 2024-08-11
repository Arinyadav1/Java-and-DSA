public class LongestWord {
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
    public static String ans = "";
    public static void longestWordWithAllPrefix(Node root, StringBuilder temp) {
        if(root == null){
            return;
        }
        Node curr = root;
        for(int i = 0; i < 26; i++){
            if(curr.children[i] != null && curr.children[i].end == true){
                temp.append((char)(i + 'a'));
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWordWithAllPrefix(curr.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        String str[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(int i = 0; i < str.length; i++){
            insert(str[i]);
        } 
        StringBuilder temp = new StringBuilder();
        longestWordWithAllPrefix(root, temp);
        System.out.println(ans);

    }
}
