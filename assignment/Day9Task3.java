import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomStack<T> {
    private List<T> stack;

    public CustomStack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();

        // Push integers onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop and display them until the stack is empty
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
