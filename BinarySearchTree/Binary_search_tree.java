import java.util.*;
public class Binary_search_tree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.left = null;
        }
    }
    public static Node insert(Node root, int data) {
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(root.data > data){
            root.left = insert(root.left, data);
        }
        else{
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static void inorder(Node root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key) {
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }
    public static Node delete(Node root, int val) {
        if(root.data > val){
            root.left =  delete(root.left, val);
        }
        else if(root.data < val){
            root.right =  delete(root.right, val);
        }
        else{
            if(root.right == null && root.left == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }       
    public static void printInRange(Node root, int x, int y){
        if(root == null){
            return;
        }
        if(x <= root.data && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data +" ");
            printInRange(root.right, x, y);
        }
        else if(root.data < y){
            printInRange(root.right, x, y);
        }
        else{
            printInRange(root.left, x, y);
        }
    }
    public static void printPath(ArrayList<Integer> path) {
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i)+ " -> ");
        }
        System.out.println();
    }
    public static void rootToLeafPath(Node root, ArrayList<Integer> path) {
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.right == null && root.left == null){
            printPath(path);
        }
        else{
        rootToLeafPath(root.left, path);
        rootToLeafPath(root.right, path);
        }
        path.remove(path.size()-1);

    }
    public static void main(String [] agrs){
        int value[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < value.length; i++){
            root = insert(root, value[i]);
        }
        // inorder(root);
        // System.out.println(search(root, 11));
        // delete(root, 5);
        // inorder(root);
        // System.out.println();
        // printInRange(root, 6, 10);
        // System.out.println();
        rootToLeafPath(root, new ArrayList<>());

    }
}