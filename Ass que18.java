import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Grapes");

        System.out.println("Original LinkedList:");
        System.out.println(list);

        // Accessing elements
        System.out.println("\nFirst element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.removeFirst();
        System.out.println("\nAfter removing first element:");
        System.out.println(list);

        list.removeLast();
        System.out.println("After removing last element:");
        System.out.println(list);

        list.remove(1);
        System.out.println("After removing element at index 1:");
        System.out.println(list);

        // Remove a specific element
        list.remove("Mango");
        System.out.println("After removing Mango:");
        System.out.println(list);
    }
}
