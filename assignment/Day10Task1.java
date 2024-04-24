import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveSecondElement {
    public static void removeEverySecondElement(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        boolean removeNext = false;

        while (iterator.hasNext()) {
            iterator.next();
            if (removeNext) {
                iterator.remove();
            }
            removeNext = !removeNext;
        }
    }

    public static void main(String[] args) {
        // Create a list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the original list
        System.out.println("Original List: " + list);

        // Remove every second element
        removeEverySecondElement(list);

        // Print the resulting list
        System.out.println("List after removing every second element: " + list);
    }
}
