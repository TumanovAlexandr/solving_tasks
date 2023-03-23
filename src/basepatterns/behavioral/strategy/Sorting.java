package basepatterns.behavioral.strategy;

public class Sorting {
    private SortingStrategy strategy;

    public Sorting(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] array) {
        strategy.sort(array);
    }
}
