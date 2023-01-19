package sdf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {

    public void exampleInt() {

        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            number.add((int) (Math.random() * 100));
        }

        System.out.println("Unsorted List " + number);

        Collections.sort(number);

        System.out.println("Sorted List " + number);

        // Collections.sort(number, Collections.reverseOrder());
        number.sort(Comparator.reverseOrder());

        System.out.println("Reversed Sorted List " + number);

    }

    public void sortEmployees() {
        Employee emp1 = new Employee("001", "tim", "Engineering", "Executive", "null@gmail.com", 6000);
    
        Employee emp2 = new Employee("002", "edmund", "Engineering", "Senior Executive", "e@gmail.com", 3000);

        Employee emp3 = new Employee("004", "george", "Engineering", "Manager Executive", "g@gmail.com", 7000);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Unsorted employees " + employees);

        // Collections.sort(employees);
        employees.sort(Comparator.comparing(e -> e.getSalary()));

        System.out.println("\nSorted employees " + employees);


    }
}
