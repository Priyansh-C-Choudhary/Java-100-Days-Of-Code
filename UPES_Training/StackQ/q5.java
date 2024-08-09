package UPES_Training.StackQ;

import java.util.Stack;

// Make a queue using two stacks - Q232
// 

public class q5 {

    Stack<Integer> push = new Stack<>();
    Stack<Integer> pop = new Stack<>();

    public void push(int x) {
        push.push(x);
    }

    public int pop() {
        if(pop.isEmpty()) {
            while(!push.isEmpty()) {
                pop.push(push.pop());
            }
        }
        return pop.pop();
    }
    public static void main(String[] args) {
        System.out.println("\nMake a queue using two stacks - Q232");
        q5 q = new q5();
        q.push(1);
        q.push(7);
        q.push(9);
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.push(4);
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
