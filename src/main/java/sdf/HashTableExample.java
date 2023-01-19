package sdf;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public void example() {

        Map <String, Integer> phones = new Hashtable<>();

        phones.put("Android", 10);
        phones.put("Iphone", 1);
        phones.put("Oppo", 9);
        phones.put("Samsung", 2);

        System.out.println("Total phone type: " + phones.size());

        for (String key : phones.keySet()) {
            System.out.println(key + "-" + phones.get(key));
        }

        String searchString = "";
        Console cons = System.console();
        while (!searchString.equals("quit")) {
            searchString = cons.readLine("give instruction> ");
            if (phones.containsKey(searchString)) {
                System.out.println(searchString + "-" + phones.get(searchString));
            } else {
                System.out.println("item not found");
            }
        }
        
        // clear all the data
        phones.clear();
        System.out.println("map cleared ");
        
        System.out.println("Total phone type: " + phones.size());
    }
    
}
