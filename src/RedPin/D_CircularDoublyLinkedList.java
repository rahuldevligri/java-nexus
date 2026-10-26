package RedPin;

public class D_CircularDoublyLinkedList {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        System.out.println(cdll.size());
        cdll.insertFirst(10);
        cdll.display();

        cdll.insertLast(20);
        cdll.display();

        cdll.insertAfter(cdll.search(10), 15);
        cdll.display();
        System.out.println(cdll.size());

        cdll.deleteFirst();
        cdll.display();

        cdll.deleteNode(15);
        cdll.display();

        cdll.update(cdll.search(20), 25);
        cdll.display();

        cdll.deleteLast();
        cdll.display();

        System.out.println(cdll.size());
    }
}

class CircularDoublyLinkedList{
    DLLNode head;

    //insertFirst  -> time O(1) & space O(1)
    public void insertFirst(int data){
        DLLNode newNode = createNode(data);
        if(isEmpty()){
            newNode.prev = newNode;
            newNode.next = newNode;
        } else{
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
        }
        head = newNode;
    }

    //insertLast -> time O(1) & space O(1)
    public void insertLast(int data){
        DLLNode newNode = createNode(data);
        if(isEmpty()){
            newNode.prev = newNode;
            newNode.next = newNode;
            head = newNode;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
        }
    }

    //insertAfter -> time O(1) & space O(1)
    public void insertAfter(DLLNode node, int data){
        if(!isEmpty() && node != null){
            DLLNode newNode = createNode(data);
            newNode.next = node.next;
            newNode.prev = node;
            node.next.prev = newNode;
            node.next = newNode;
        }
    }

    //search -> time O(n) & space O(1)
    public DLLNode search(int data){
        if(!isEmpty()){
            DLLNode t = head;
            do{
                if(t.data ==  data){
                    return t;
                }
                t = t.next;
            }while(t != head);
        }
        return null;
    }

    //deleteFirst -> time O(1) & space O(1)
    public void deleteFirst(){
        if(!isEmpty()) {
            if (head.next == head) {
                head = null;
            } else {
                head.prev.next = head.next;
                head.next.prev = head.prev;
                head = head.next;
            }
        }
    }

    //deleteLast -> time O(1) & space O(1)
    public void deleteLast(){
        if(!isEmpty()){
            if(head.next == head){
                head = null;
            } else{
                head.prev.prev.next = head;
                head.prev = head.prev.prev;
            }
        }
    }

    //deleteNode  -> time O(n) & space O(1)
    public void deleteNode(int data){
        if(!isEmpty()){
            DLLNode n = search(data);
            if(n!= null){
                if(n == head){
                    deleteFirst();
                } else{
                    n.next.prev = n.prev;
                    n.prev.next = n.next;
                }
            }
        }
    }

    //updateNode -> time O(1) & space O(1)
    public void update(DLLNode node, int data){
        if(node != null){
            node.data = data;
        }
    }

    //size -> time O(n) & space O(1)
    public int size(){
        int size = 0;
        if(!isEmpty()){
            DLLNode t = head;
            do{
                size++;
                t = t.next;
            }while(t != head);
        }
        return size;
    }

    //isEmpty -> time O(1) & space O(1)
    public boolean isEmpty(){
        return head == null;
    }

    //createNode -> time O(1) & space O(1)
    private DLLNode createNode(int data){
        DLLNode newNode = new DLLNode();
        newNode.data = data;
        return newNode;
    }

    //display -> time O(n) & space O(1)
    public void display(){
        if(!isEmpty()){
            DLLNode t = head;
            do{
                System.out.print(t.data + " ");
                t = t.next;
            }while(t != head);
            System.out.println();
        }
    }
}