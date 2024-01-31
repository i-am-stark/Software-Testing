package junit;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        if (!isEmpty()) {
            return items.remove(items.size() - 1);
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
