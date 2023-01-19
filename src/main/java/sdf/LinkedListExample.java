package sdf;

import java.util.LinkedList;

public class LinkedListExample {

    public void example() {
        
        LinkedList <String> linkedList = new LinkedList<>();

        System.out.println("\noriginal list");
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("d");
        linkedList.add("c");
        linkedList.add("f");
        linkedList.add("x");

        linkedList.forEach(i -> System.out.println(i));

        System.out.println("\nremove d");
        linkedList.remove("d");

        System.out.println("\nremove first & last");
        System.out.println(linkedList.removeFirst()); 
        System.out.println(linkedList.removeLast());

        System.out.println("\nprint list again");
        linkedList.forEach(i -> System.out.println(i));


    }
    
}
