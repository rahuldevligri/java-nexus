package Interview_Prep.Top_20.Stack.Practice;

public class Q_MinStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        System.out.println("Peek: " + s.peek()); //5
        System.out.println("MinStack: "+ s.getMin()); //5

        s.push(3);
        System.out.println("Peek: " + s.peek()); //3
        System.out.println("MinStack: "+ s.getMin()); //3

        s.push(8);
        System.out.println("Peek: " + s.peek()); //8
        System.out.println("MinStack: "+ s.getMin()); //3

        s.push(3);
        System.out.println("Peek: " + s.peek()); //3
        System.out.println("MinStack: "+ s.getMin());//3

        System.out.println("pop: " + s.pop()); //3
        System.out.println("Peek: " + s.peek());//8
        System.out.println("MinStack: "+ s.getMin());//3

        System.out.println("pop: " + s.pop());//8
        System.out.println("Peek: " + s.peek());//3
        System.out.println("MinStack: "+ s.getMin());//3
    }
}

class Stack{
    Node head;
    MinStack min = new MinStack();

    //add - O(1)
    public void push(int data){
        Node n = new Node(data);
        if(min.isEmpty()){
            min.push(data);
        }
        if(!isEmpty()){
            if(data <= min.peek()){
                min.push(data);
            }
            n.next = head;
        }
        head = n;
    }

    //remove - O(1)
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty...");
        }
        int d = head.data;
        if(d == min.peek()){
            min.pop();
        }
        head = head.next;
        return d;
    }

    //peek - O(1)
    public int peek(){
        if(head == null){
            throw new RuntimeException("Stack is Empty...");
        }
        return head.data;
    }

    //get Minimum from stack - O(1)
    public int getMin(){
        return min.peek();
    }

    //isEmpty - O(1)
    public boolean isEmpty() {
        return head == null;
    }
}

class MinStack {
    Node head;

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
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty...");
        }
        int d = head.data;
        head = head.next;
        return d;
    }

    //peek - O(1)
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty...");
        }
        return head.data;
    }

    //isEmpty
    public boolean isEmpty() {
        return head == null;
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
