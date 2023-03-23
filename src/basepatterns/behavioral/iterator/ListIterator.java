package basepatterns.behavioral.iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    private List<T> list;
    private int index;

    public ListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}
