package basepatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 3, 2, 8};
        Sorting sorting = new Sorting(new QuickSort());
        sorting.sort(array);
        sorting.setStrategy(new BubbleSort());
        sorting.sort(array);
    }
}
