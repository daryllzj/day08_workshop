package sdf;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {

    public void exampleString(){
        String name[] = {"hello", "world", "daryl"};

        System.out.println("Unsorted Array " + Arrays.toString(name));

        Arrays.sort(name);

        System.out.println("Sorted Array " + Arrays.toString(name));

        Arrays.sort(name, Collections.reverseOrder());

        System.out.println("Reverse Sorted Array " + Arrays.toString(name));
    }

    public void exampleInt(){
        Integer num[] = {9, 3, 4, 5, 2};

        System.out.println("Unsorted Array " + Arrays.toString(num));

        Arrays.sort(num);

        System.out.println("Sorted Array " + Arrays.toString(num));

        Arrays.sort(num, Collections.reverseOrder());

        System.out.println("Reverse Sorted Array " + Arrays.toString(num));
    }

    public void exampleIntManual(){
        int num[] = {9, 3, 4, 5, 2};

        System.out.println("Unsorted Array " + Arrays.toString(num));

        Arrays.sort(num);

        System.out.println("Sorted Array " + Arrays.toString(num));

        int start = 0;
        int end = num.length - 1;
               while (start < end) {
                   if (start == end) {
                       return;
                   }
                   int temp = num[start];
                   num[start] = num[end];
                   num[end] = temp;
                   start++;
                   end--;
               }

        System.out.println("Reverse Sorted Array " + Arrays.toString(num));
    }
    
}
