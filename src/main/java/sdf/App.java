package sdf;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // ArraySortExample arr = new ArraySortExample();
        // arr.exampleString();
        // arr.exampleIntManual();

        // CollectionSortExample arr1 = new CollectionSortExample();
        // arr1.sortEmployees();

        // HashMapExample hashMapExample = new HashMapExample();
        // hashMapExample.example();

        ConcurrentHashMapExample concurrentHashMapExample = new ConcurrentHashMapExample();
        concurrentHashMapExample.example();

    }
}
