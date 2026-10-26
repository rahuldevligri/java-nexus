package Interview_Prep.Top_20.Queue.Queue_implementation;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImp {
    public static void main(String[] args) {
        QueueArray qa = new QueueArray(5);
        System.out.println("__________QueueArray__________");
        qa.enqueue(1);
        qa.enqueue(2);
        qa.enqueue(3);
        qa.enqueue(4);
        qa.enqueue(5);
        qa.display();
        qa.dequeue();
        qa.display();

        CircularQueueArray cqa = new CircularQueueArray(5);
        System.out.println("__________CircularQueueArray__________");
        cqa.enqueue(1);
        cqa.enqueue(2);
        cqa.enqueue(3);
        cqa.enqueue(4);
        cqa.enqueue(5);
        cqa.display();
        cqa.dequeue();
        cqa.display();
        cqa.enqueue(6);
        cqa.display();
        cqa.enqueue(7);
        cqa.display();

        QueueLinkedList qll = new QueueLinkedList();
        System.out.println("__________QueueLinkedList__________");
        qll.enqueue(1);
        qll.enqueue(2);
        qll.enqueue(3);
        qll.enqueue(4);
        qll.enqueue(5);
        qll.display();
        qll.enqueue(6);
        qll.display();
        qll.dequeue();
        System.out.println(qll.rear());
        qll.display();


        Queue<Integer> q = new LinkedList<>();
        System.out.println("__________QueueCollection__________");
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.add(6);
        System.out.println(q);;
        q.remove();
        System.out.println(q.peek());
        System.out.println(q);;


    }
}

class QueueArray{
    int[] arr;
    int size;
    int rear = -1;

    QueueArray(int size){
        arr = new int[size];
        this.size = size;
    }

    //add - O(1)
    public void enqueue(int data){
        if(rear == size-1){
            System.out.println("Queue is full...");
            return;
        }
        arr[++rear] = data;
    }

    //remove - O(n)
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty..");
            return -1;
        }
        int front = arr[0];
        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    //peek - O(1)
    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty..");
            return -1;
        }
        return arr[0];
    }

    //isEmpty
    public boolean isEmpty(){
        return rear == -1;
    }

    public void display() {
        for (int i=0;i<rear;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class CircularQueueArray{
    private final int size;
    int[] arr;
    int rear = -1;
    int front = -1;

    CircularQueueArray(int size){
        arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isFull(){
        return (rear+1) % size == front;
    }

    //add - O(1)
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is empty..");
            return;
        }
        if(front == -1){
            front=0;
        }
        rear = (rear+1) % size;
        arr[rear] = data;
    }

    //remove - O(1)
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty..");
            return -1;
        }

        int result = arr[front];
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front+1) % size;
        }
        return result;
    }

    //peek - O(1)
    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty..");
            return -1;
        }
        return arr[front];
    }

    public void display() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class QueueLinkedList{
    public Node head;
    public Node tail;

    class Node{
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    //add
    public void enqueue(int data){
        Node n = new Node(data);
        if(tail == null){
            head = tail = n;
            return;
        }
        tail.next = n;
        tail = n;
    }

    //remove
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty...");
            return -1;
        }
        int front = head.data;
        if(head == null){
            tail = null;
        }
        head = head.next;
        return front;
    }

    //peek
    public int rear(){
        return head.data;
    }

    //isEmpty
    public boolean isEmpty(){
        return head == null && tail == null;
    }

    //print
    public void display(){
        Node t = head;
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
}