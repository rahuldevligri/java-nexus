package RedPin.Questions;

public class SinglyLinkedList {
    SLLNode head;

    //addFirst -> time and space O(1)
    public void addFirst(int data){
        SLLNode newNode = createNode(data);
        if(!isEmpty()){
            newNode.next = head;
        }
        head = newNode;
    }

    //addLast -> time O(n) and space O(1)
    public void addLast(int data){
        SLLNode newNode = createNode(data);
        if(!isEmpty()){
            SLLNode t = head;
            while(t.next != null){
                t = t.next;
            }
            t.next = newNode;
        } else {
            head = newNode;
        }
    }

    //addAfter -> time O(1) and space O(1)
    public void addAfter(int data, SLLNode node){
        if(!isEmpty() && node != null){
            SLLNode newNode = createNode(data);
            newNode.next = node.next;
            node.next = newNode;
        }
    }
    //search -> time O(n) and space O(1)
    public SLLNode search(int data){
        if(!isEmpty()){
            SLLNode t = head;
            while(t != null){
                if(t.data == data){
                    return t;
                }
                t = t.next;
            }
        }
        return null;
    }

    //deleteFirst -> time O(1) and space O(1)
    public void deleteFirst(){
        if(!isEmpty()){
            head = head.next;
        }
    }

    //deleteLast -> time O(n) and space O(1)
    public void deleteLast(){
        if(!isEmpty()){
            if(head.next == null){
                head = null;
            } else {
                SLLNode t = head;
                while(t.next.next != null){
                    t = t.next;
                }
                t.next = null;
            }
        }
    }

    //deleteNode
    public void deleteNode(int data){
        SLLNode n = search(data);
        if(n == null){
            return;
        }
        if(head == n){
            head = head.next;
            return;
        }
        SLLNode t = head;
        while(t.next != n){
            t = t.next;
        }
        t.next = n.next;
    }

    //update
    public void updateNode(SLLNode node, int data){
        if(node != null){
            node.data = data;
        }
    }

    //size
    public int size(){
        int size = 0;
        if(!isEmpty()){
            SLLNode t = head;
            while(t != null){
                t = t.next;
                size++;
            }
        }
        return size;
    }

    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    //display
    public void display(){
        if(!isEmpty()){
            SLLNode t = head;
            while(t != null){
                System.out.print(t.data + " ");
                t = t.next;
            }
            System.out.println();
        } else{
            System.out.println("DLLNode is Empty...");
        }
    }

    //create Node
    private SLLNode createNode(int data) {
        SLLNode newNode = new SLLNode();
        newNode.data = data;
        return newNode;
    }

    //create Cycle
    public void createCycle(int data) {
        SLLNode target = search(data);

        SLLNode t = head;
        while(t.next != null){
            t = t.next;
        }
        t.next = target;
    }
}

