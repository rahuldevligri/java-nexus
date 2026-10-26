package RedPin;

public class B_DoublyLinkedList {
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertFirst(10);
        dll.display();

        dll.insertLast(20);
        dll.display();

        dll.insertAfter(dll.search(10), 30);
        dll.display();
        System.out.println(dll.size());

        dll.deleteFirst();
        dll.display();

        dll.deleteLast();
        dll.display();

        dll.update(dll.search(30), 15);
        dll.display();

        dll.deleteNode(15);
        dll.display();
        System.out.println(dll.size());
    }
}

class DoublyLinkedList {
    DLLNode head;

    //insertFirst -> time O(1) & space O(1)
    public void insertFirst(int data){
        DLLNode node = createNode(data);
        if(!isEmpty()){
            node.next = head;
            head.prev = node;
        }
        head = node;
    }

    //insertLast -> time O(n) & space O(1)
    public void insertLast(int data){
        DLLNode node = createNode(data);
        if(isEmpty()){
            head = node;
            return;
        }
        if(head.next == null){
            node.prev = head;
            head.next = node;
            return;
        } else {
            DLLNode t = head;
            while(t.next != null){
                t = t.next;
            }
            node.prev = t;
            t.next = node;
            return;
        }
    }

    //insertAfter-> time O(1) & space O(1)
    public void insertAfter(DLLNode node, int data){
        DLLNode newNode = createNode(data);
        if(node == null){
            return;
        }
        if (!isEmpty()){
            newNode.prev = node;
            newNode.next = node.next;
            if(node.next != null){
                node.next.prev = newNode;
            }
            node.next = newNode;
        } else {
            head = newNode;
        }
    }

    //search -> time O(n) & space O(1)
    public DLLNode search(int data){
        if(!isEmpty()){
            DLLNode t = head;
            while(t != null){
                if(t.data == data){
                    return t;
                }
                t = t.next;
            }
        }
        return null;
    }

    //deleteFirst -> time O(1) & space O(1)
    public void deleteFirst(){
        head = head.next;
        if(!isEmpty()){
            head.prev = null;
        }
    }

    //deleteLast -> time O(n) & space O(1)
    public void deleteLast(){
        if(!isEmpty()){
            if(head.next == null){
                head = null;
                return;
            }

            DLLNode t = head;
            while(t.next.next != null){
                t = t.next;
            }
            t.next = null;
        }
    }

    //deleteNode -> time O(n) & space O(1)
    public void deleteNode(int data){
        DLLNode node = search(data);
        if(node == null){
            return;
        }
        if(node == head){
            head = head.next;
            if(head != null){
                head.prev = null;
            }
            return;
        }
        node.prev.next = node.next;
        if(node.next != null){
            node.next.prev = node.prev;
        }
    }

    //update -> time O(1) & space O(1)
    public void update(DLLNode node, int data){
        if(node != null && !isEmpty()){
            node.data = data;
        }
    }

    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    //size -> time O(n) & space O(1)
    public int size(){
        int size = 0;
        DLLNode t = head;
        while(t != null){
            t = t.next;
            size++;
        }
        return size;
    }

    //display -> time O(n) & space O(1)
    public void display(){
        if(!isEmpty()){
            DLLNode t = head;
            while(t != null){
                System.out.print(t.data + " ");
                t = t.next;
            }
            System.out.println();
        }
    }

    //create Node
    private DLLNode createNode(int data) {
        DLLNode newNode = new DLLNode();
        newNode.data = data;
        return newNode;
    }
}
