package src.LinkedList;

public class LinkedList {
   
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

 public void print(){
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data+ " -> ");
        temp = temp.next;
    } 
    System.out.print(" null " + "->");
 }
 
public void add(int idx,int data){
    if(idx == 0){
        addFirst(data); 
        return;
    }
    Node newnode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < idx-1) {
        temp = temp.next;
        i++;
    }
    newnode.next = temp.next;
    temp.next = newnode;
}
public int RemoveFirst(){
    if (size == 0) {
        System.out.println("Linked list is EMpty");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int  val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
}

public int removeLast(){
    if(size == 0){
        System.out.println("LL is Empty");
        return Integer.MIN_VALUE;   
    }else if(size == 1){
        int val = head.data;
        size = 0;
        return val;
    }
    Node prev = head;
    for(int  i =0;i<size-i+1;i++){
        prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail  = prev;
    size --;
    return val;
}

public int itrSearch(int key){
    Node temp = head; 
    int i = 0 ;

    while (temp != null) {
           if (temp.data == key) {
                return i;
           } 
           temp = temp.next;
           i++;
    }
    return -1;

}

public int helper(Node head,int key){
    if(head == null){
        return -1;
    }
    if(head.data == key){
        return 0;
    }
    int idx = helper(head.next, key);
    if(idx == -1){
        return  -1;
    }
    return idx+1;
}

public int recSearch(int key){
    return helper(head,key);
}

public void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev  = curr;
        curr = next;
    }
    head = prev;
}
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        // System.out.println("Recursive search ==>"+ll.recSearch(3));
        // System.out.println(ll.recSearch(25));
        ll.reverse();
        ll.print();
    }
}
