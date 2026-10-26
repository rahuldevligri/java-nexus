package Interview_Prep.Top_20.Queue.Queue_implementation.Approach_2;

public class QueueUsing2Stacks_2 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.front());
        System.out.println(q.dequeue());
        q.enqueue(60);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}

class Queue{
    Stack inputStack = new Stack();
    Stack outputStack = new Stack();

    //add - O(1)
    public void enqueue(int data){
        inputStack.push(data);
    }

    //remove - amortized O(1)
    public int dequeue(){
        front();
        return outputStack.pop();
    }

    //peek - amortized O(1)
    public int front(){
        if(isOutputStackEmpty()){
            while(!isInputStackEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }

    //isEmpty
    private boolean isInputStackEmpty(){
        return inputStack.isEmpty();
    }
    private boolean isOutputStackEmpty(){
        return outputStack.isEmpty();
    }
}

class Stack{
    public Node head;

    //add - O(1)
    public void push(int data){
        Node n = new Node(data);
        if(!isEmpty()){
            n.next = head;
        }
        head = n;
    }

    //remove - O(1)
    public int pop(){
        if(isEmpty())
            throw new RuntimeException("Queue Empty");

        int t = head.data;
        head = head.next;
        return t;
    }

    //peek - O(1)
    public int peek(){
        if(isEmpty())
            throw new RuntimeException("Queue Empty...");
        return head.data;
    }

    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }
}

class Node{
    public int data;
    public Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
