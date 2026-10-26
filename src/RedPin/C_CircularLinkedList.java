package RedPin;

public class C_CircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        System.out.println(cll.size());
        cll.insertFirst(10);
        cll.display();

        cll.insertLast(20);
        cll.display();

        cll.insertAfter(cll.search(10),15);
        cll.display();
        System.out.println(cll.size());

        cll.updateNode(cll.search(15), 30);
        cll.display();

        cll.deleteFirst();
        cll.display();

        cll.deleteLast();
        cll.display();

        cll.deleteNode(cll.search(30));
        cll.display();

        System.out.println(cll.size());
    }

}

class CircularLinkedList{
    SLLNode head;

    //insertFirst -> time O(n) & space O(1)
    public void insertFirst(int data){
        SLLNode newNode = createNode(data);
        if(isEmpty()){
            newNode.next = newNode;
        } else{
            SLLNode t = head;
            while(t.next != head){
                t=t.next;
            }
            newNode.next = t.next;
            t.next = newNode;
        }
        head = newNode;
    }

    //insertLast -> time O(n) & space O(1)
    public void insertLast(int data){
        SLLNode newNode = createNode(data);

        if(isEmpty()){
            newNode.next = newNode;
            head = newNode;
        } else {
            SLLNode t = head;
            while(t.next != head){
                t = t.next;
            }
            newNode.next = t.next;
            t.next = newNode;
        }
    }

    //insertAfter -> time O(1) & space O(1)
    public void insertAfter(SLLNode node, int data){
        SLLNode newNode = createNode(data);
        if(!isEmpty() && node != null){
                newNode.next = node.next;
                node.next = newNode;
        }
    }

    //search -> time O(n) & space O(1)
    public SLLNode search(int data){
        if(!isEmpty()) {
            SLLNode t = head;
            do{
                if(t.data ==  data){
                    return t;
                }
                t = t.next;
            } while(t != head);
        }
        return null;
    }

    //deleteFirst -> time O(n) & space O(1)
    public void deleteFirst(){
        if(!isEmpty()){
            if(head.next == head){
                head = null;
            } else{
                SLLNode t = head;
                while(t.next != head){
                    t = t.next;
                }
                t.next = t.next.next;
                head = t.next;
            }
        }
    }

    //deleteLast -> time O(n) & space O(1)
    public void deleteLast(){
        if(!isEmpty()){
            if(head.next == head){
                head = null;
            } else{
                SLLNode t = head;
                while(t.next.next != head){
                    t = t.next;
                }
                t.next = t.next.next;
            }
        }
    }

    //deleteNode -> time O(n) & space O(1)
    public void deleteNode(SLLNode node){
        if(!isEmpty() && node != null){
            if(node == head){
                deleteFirst();
            } else {
                SLLNode t = head;
                do{
                    if(t.next == node){
                        t.next = t.next.next;
                        return;
                    }
                    t = t.next;
                }while(t != head);
            }
        }
    }

    //updateNode
    public void updateNode(SLLNode node,int data){
        if(!isEmpty() && node != null){
            node.data = data;
        }
    }

    //size
    public int size(){
        int size = 0;
        if(!isEmpty()){
            SLLNode t = head;
            do{
               size++;
               t = t.next;
            }while(t != head);
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
            do{
                System.out.print(t.data + " ");
                t = t.next;
            }while(t != head);
            System.out.println();
        }
    }

    //create Node
    private SLLNode createNode(int data){
        SLLNode node = new SLLNode();
        node.data = data;
        return node;
    }
}
