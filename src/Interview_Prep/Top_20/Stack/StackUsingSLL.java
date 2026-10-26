package Interview_Prep.Top_20.Stack;

public class StackUsingSLL { //LIFO
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        System.out.println("peek: " + s1.peek());
        s1.push(20);
        System.out.println("peek: " + s1.peek());
        System.out.println("pop: "+ s1.pop());
        System.out.println("peek: " + s1.peek());
        System.out.println("pop: "+ s1.pop());
        System.out.println("pop: "+ s1.pop());
    }
}
class Stack{
    public Node head;

    public void push(int data){
        Node n = new Node(data);
        if(head != null){
            n.next = head;
        }
        head = n;
    }

    public int pop(){
        if(head != null){
            int d = head.data;
            head = head.next;
            return d;
        }
        return -1;
    }

    public int peek(){
        if(head!=null)
            return head.data;
        return -1;
    }
}

class Node {
    public int data;
    public Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
