package RedPin.Questions;

public class Q3_DetectCycle {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(10);
        sll.addLast(20);
        sll.addLast(30);
        sll.addLast(40);

        sll.createCycle(20);

        SLLNode slow = sll.head;
        SLLNode fast = sll.head;
        boolean flag = false;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }

        System.out.println(flag);

        System.out.println(slow != null ? slow.data : -1);
    }
}
