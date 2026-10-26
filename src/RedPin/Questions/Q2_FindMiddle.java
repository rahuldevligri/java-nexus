package RedPin.Questions;

public class Q2_FindMiddle {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(10);
        sll.addLast(20);
        sll.addLast(30);
        sll.addLast(40);

        sll.display();
        SLLNode slow = sll.head;
        SLLNode fast = sll.head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        sll.display();
        System.out.println(slow != null ? slow.data : -1);
    }
}
