public class Trie{
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

    //wordbreak problem
    public static boolean wordbreak(String key) {
        if(key.length() == 0){
            return true;
        }
        for(int i = 1; i <= key.length(); i++){
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);
            if(search(firstPart) && wordbreak(secondPart)){
                return true;
            }
        }
        return false;
    }

    //startwith problem
    public static boolean startWith(String prefix) {
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String word[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i = 0; i < word.length; i++){
            insert(word[i]);
        }
        System.out.println("Word Break " +wordbreak("likesamsungiicemobile"));

        System.out.println("Prefix exist " +startWith("i"));

        
    }
}