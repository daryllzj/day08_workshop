package sdf;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public void example() {
        Map<String, Integer> laptops = new ConcurrentHashMap<>();
        laptops.put("apple", 5);
        laptops.put("samsung", 9);
        laptops.put("asus", 2);
        laptops.put("microsoft", 8);

        System.out.println("Total laptops =" + laptops.size());

        for (String key : laptops.keySet()) {
            System.out.println(key + "-" + laptops.get(key));
        }

        // String input ="";
        // Console cons = System.console();

        // while (!input.equals("quit")) {
        // input = cons.readLine(">");

        // if (laptops.containsKey(input)) {
        // System.out.println(input +"-" + laptops.get(input));
        // }
        // }

        String input = "apple";

        if (laptops.containsKey(input)) {
            System.out.println(input + "-" + laptops.get(input));
        }

        Enumeration<Integer> elems = ((ConcurrentHashMap<String, Integer>)laptops).elements();

        while (elems.hasMoreElements()) {
            System.out.println(elems.nextElement());
        }

        Integer retvalue = laptops.putIfAbsent("Apple", 13);
        if (retvalue != null) {
            System.out.println("Item found: " + retvalue);
        }

        System.out.println("Total laptops =" + laptops.size());

        String string = "apple";

        if (laptops.containsKey(string)) {
            System.out.println(string + "-" + laptops.get(string));
        }

        retvalue = laptops.putIfAbsent("Microsoft", 25);

        for (String a: laptops.keySet()) {
            System.out.println(a+ "-" + laptops.get(a));
        }


    }
}
