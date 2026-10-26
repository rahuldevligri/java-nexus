package Interview_Prep.Top_20.Queue.Queue_implementation.Approach_1;

public class QueueUsing2Stacks_1 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.front());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}

class Queue{
    Stack inputStack = new Stack();
    Stack tempStack = new Stack();

    //add - O(n)
    public void enqueue(int data){
        while(!inputStack.isEmpty()){
            tempStack.push(inputStack.pop());
        }

        inputStack.push(data);

        while(!tempStack.isEmpty()){
            inputStack.push(tempStack.pop());
        }
    }

    //remove - O(1)
    public int dequeue(){
        return inputStack.pop();
    }

    //peek - O(1)
    public int front(){
        return inputStack.peek();
    }
}

class Stack{
    public Node head;

    //add - O(1)
    public void push(int data){
        Node n = new Node(data);
        if(head != null){
            n.next = head;
        }
        head = n;
    }

    //remove - O(1)
    public int pop(){
        if(head != null){
            int d = head.data;
            head = head.next;
            return d;
        }
        return -1;
    }

    //peek - O(1)
    public int peek(){
        if(head != null){
            return head.data;
        }
        return -1;
    }

    public boolean isEmpty(){
        return head == null;
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
