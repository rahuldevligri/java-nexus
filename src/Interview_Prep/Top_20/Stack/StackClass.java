package Interview_Prep.Top_20.Stack;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        pushAtBottom(40, s);
        for(int i : s){
            System.out.println(i);
        }
    }

    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
}
