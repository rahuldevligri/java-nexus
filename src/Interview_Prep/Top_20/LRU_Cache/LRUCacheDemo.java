package Interview_Prep.Top_20.LRU_Cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheDemo {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.put(1,10);
        cache.displayDLL();
        cache.put(2,20);
        cache.displayDLL();
        cache.put(3,30);
        cache.displayDLL();
        cache.put(4,40);
        cache.displayDLL();
        cache.put(3, 50);
        cache.displayHM();
        cache.displayDLL();
        System.out.println(cache.get(5));
        cache.displayDLL();
    }
}

class Node {
    private int key, value;
    private Node next, prev;

    public void setKey(int key){
        this.key = key;
    }
    public int getKey(){
        return key;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}

class LRUCache {
    private Node head;
    private final int limit;
    private HashMap<Integer, Node> hm = new HashMap<>();

    public LRUCache(int limit){
        this.limit = limit;
    }

    public int get(int key){
        if(hm.containsKey(key)){
            updateNode(hm.get(key));
            return hm.get(key).getValue();
        } else {
            return -1;
        }
    }

    public int put(int key, int value){
        System.out.println("HM size: "+ hm.size());
        if(hm.containsKey(key)){
            Node node = hm.get(key);
            node.setValue(value);
            updateNode(node);
        } else {
            Node node = new Node();
            node.setKey(key);
            node.setValue(value);
            addNode(node);
            hm.put(key, node);
            if(hm.size() > limit){
                int dk = deleteNode();
                System.out.println("deleteKey: " + dk);
                hm.remove(dk);
            }
        }
        return value;
    }

    private void addNode(Node node){
        if(head == null){
            node.setNext(node);
            node.setPrev(node);
        } else {
            node.setNext(head);
            node.setPrev(head.getPrev());
            head.getPrev().setNext(node);
            head.setPrev(node);
        }
        head = node;
    }

    private int deleteNode(){
        int key = 0;
        if(head != null){
            key = head.getPrev().getKey();
            head.getPrev().getPrev().setNext(head);
            head.setPrev(head.getPrev().getPrev());
        }
        return key;
    }

    private void updateNode(Node node){
        if(head != null){
            if(node != head){
                node.getPrev().setNext(node.getNext());
                node.getNext().setPrev(node.getPrev());
                addNode(node);
            }
        }
    }

    public void displayDLL(){
        if(head!= null){
            Node t = head;
            do {
                System.out.print(t.getKey() + " -> " + t.getValue() + ", ");
                t = t.getNext();
            } while(t != head);
        }
        System.out.println();
    }

    public void displayHM(){
        for(Map.Entry<Integer, Node> me : hm.entrySet()){
            System.out.println(me.getKey() + " " + me.getValue().getValue());
        }
    }
}
