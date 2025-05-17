package src.LinkedListt;

public class LinkedList{
        public static class Node {
            int data;
            Node next;  

            public Node(int data){
                    this.data = data;
                    this.next = null;
            }
        }
        public static Node head;
        public static Node tail;

        public void AddFirst(int data){
            // step :1 = create new Node
           Node newnode = new Node(data);
        //    step:2 = newNode.next = head
           newnode.next = head;
        // check if the head is null or empty then make head =  tail = then = newnode  
        if(head==null){
            head = tail = newnode;
            return;
             }
         }
         //O(1)
        
         public void AddLast(int data){
            // step :1 = create new Node
            Node newnode = new Node(data); 
            //step 2 = make tail .next to head
            if(head == null){
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
           //step 3 :  Make tail as newnode  
            tail = newnode;
         } 

    public void Display(){
        if (head == null) {
                System.out.println("Linked lIst IS empty \n");
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("NUll");
    }

    public void add(int position,int data){
            Node newnode = new Node(data);
            Node temp  =head;
            int i = 0;
            while (i<position-1) {
                i++;
            }
            newnode.next = temp.next;
            temp.next = newnode;
    }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.AddFirst(1);
            ll.AddFirst(25);
            ll.AddLast(3);
            ll.AddLast(8);
            ll.Display();
        }
}