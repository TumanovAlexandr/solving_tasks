package basepatterns.behavioral.iterator;

public interface Collection<T> {
    void add(T item);
    Iterator<T> iterator();
}
