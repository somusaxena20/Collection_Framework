package list.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        
        Stack<Object> s = new Stack<>();

        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println(s);

        System.out.println(s.search("A"));
        System.out.println(s.search("C"));
    }
}