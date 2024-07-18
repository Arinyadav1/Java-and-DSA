class LinkList {
    Node head;
    private int size;

    public LinkList() {
        this.size = 0;
    }
    
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //addfirst
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //addLast
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next!= null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //removeFirst
    public void removeFirst(){
        if(head == null){
            System.out.println("List is Blank");
        }
        size--;
        head = head.next;
    }

    //removeLast
    public void removeLast(){
        if(head == null){
            System.out.println("List is Blank");
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Get size of the list
    public int size(){
        return size;
    }

    //insert data in randon index
    public void insert(int index, String Data){
        if(index > size || index < 0){
            System.out.println("Indext Not Valid");
            return;
        }
        size++;
        Node newNode = new Node(Data);
        if(head == null || index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;
        for(int i = 1; i < size; i++){
            if(index == i){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
            }
            currNode = currNode.next;
        }
    }

    // Reverse LinkedList By doing Iterate
    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }

        Node preNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = preNode;

            //update
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }

    // Reverse LinkedList By Recusively
    public Node reverseRecusive(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newNode = reverseRecusive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
 


    //print list
    public void printList() {
        if(head == null){
            System.out.print("List is Blank");
            return;
        }
        Node curNode = head;
        System.out.print("[ ");
        while (curNode != null) {
            System.out.print(curNode.data + " --> ");
            curNode = curNode.next;
        }
        System.out.println("null ]");
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("TajMahal");
        list.printList();
        list.head = list.reverseRecusive(list.head);
        list.printList();
        System.out.println(list.size());
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        System.out.println(list.size());
        list.insert(4, "This");
        list.printList();
    }
}
