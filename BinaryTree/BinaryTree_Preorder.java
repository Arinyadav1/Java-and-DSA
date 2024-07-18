import java.util.*;
public class BinaryTree_Preorder{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int [] nodes) {
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    //preorder root left subset then right subset
    public static void preorder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //inorder left subset root then right subset
    public static void inorder(Node root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //postorder left subset right subset then root
    public static void postorder(Node root) {
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    // Level order traversal
    public static void levelOrder(Node root) {
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curNode = q.remove();
            if(curNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curNode.data);
                if(curNode.left != null){
                    q.add(curNode.left);
                }
                if(curNode.right != null){
                    q.add(curNode.right);
                }
            }
            
        }
    }

    // Count the numbers of nodes in BinaryTree
    public static int countOfNodes(Node root) {
        if(root == null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    // Sum of all Nodes of BinaryTree
    public static int sumOfNodes(Node root) {
        if(root == null){
            return 0;
        }
        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);

        return leftsum + rightsum + root.data;
    }

    // Height of tree
    public static int heightOfTree(Node root) {
        if(root == null){
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int totalHeight = Math.max(leftHeight, rightHeight) + 1;

        return totalHeight;

    }
    // Diameter of the Tree O(n^2)
    public static int diameterOfTheTree(Node root) {
        if(root == null){
            return 0;
        }
        int leftSubset = diameterOfTheTree(root.left);
        int rightSubset = diameterOfTheTree(root.right);
        int diameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diameter, Math.max(leftSubset, rightSubset));
    }

    // Diameter of the Tree O(n)
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root) {
        if(root == null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);
        TreeInfo myinfo = new TreeInfo(myHight, myDiam);
        return myinfo;

    }
    public static int sumOfKthNodes(Node root, int k){
        if(root == null){
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        int level = 0;
        int flag = 0;

        while(!q.isEmpty()){
            int size = q.size();
            while (size-- > 0) {
                Node value = q.remove();
                if(level == k){
                    flag = 1;

                    sum += value.data;
                }else{
                    if(value.left != null){
                        q.add(value.left);
                    }
                    if(value.right != null){
                        q.add(value.right);
                    }
                }           
            }
            level++;
            if(flag == 1){
                break;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes); 
        // System.out.println(root.data);
        // System.out.print("Preorder ");
        // preorder(root);
        // System.out.print("inorder ");
        // inorder(root);
        // System.out.print("Postorder ");
        // postorder(root);
        levelOrder(root);
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(heightOfTree(root));
        System.out.println(diameterOfTheTree(root));
        System.out.println(diameter2(root).diam);
        System.out.println(sumOfKthNodes(root, 2));
     }
}