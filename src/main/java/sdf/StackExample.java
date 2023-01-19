package sdf;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public void example() {
        Stack <Integer> stack = new Stack<>();

        // pushing or putting something on the stack (FILO, LIFO)
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        //pop or taking something from the stack
        for (int i = 0; i < 5; i++) {
            Integer stackItem = stack.pop();
            System.out.println("stack item (pop): " + stackItem);
        }

        Integer item = stack.peek();
        System.out.println("the top item is " + item);

        Integer firstItem = stack.firstElement();
        System.out.println("first item is " + firstItem);

        Integer indexElement = stack.search(2);
        System.out.println("2 is at position " + indexElement);

        Iterator<Integer> its = stack.iterator();
        while (its.hasNext()) {
            Integer stackIt = its.next();
            System.out.println("Iterator stack item: " + stackIt);
        }


    }
}
