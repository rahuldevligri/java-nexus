package RedPin.Questions;

public class Q1_ReverseSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(10);
        sll.addLast(20);
        sll.addLast(30);
        sll.addLast(40);

        sll.display();

        SLLNode prev = null;
        SLLNode curr = sll.head;

        while(curr != null){
            SLLNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        sll.head = prev;
        sll.display();
    }
    //Time - O(n)
    //Space - O(1)
}




