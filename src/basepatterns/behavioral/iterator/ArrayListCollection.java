package basepatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection<T> implements Collection<T> {
    private List<T> list;

    public ArrayListCollection() {
        list = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        list.add(element);
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(list);
    }
}
