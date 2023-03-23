package basepatterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayListCollection<>();
        collection.add("First");
        collection.add("Second");
        collection.add("Third");
        collection.add("Fourth");
        collection.add("Fifth");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
