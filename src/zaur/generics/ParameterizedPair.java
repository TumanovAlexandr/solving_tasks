package zaur.generics;

public class ParameterizedPair {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Hi", 20);
        System.out.println(pair.getFirstValue() + " " + pair.getSecondValue());
        otherPair<String> pair1 = new otherPair<String>("Hi", "Bye");
    }
}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class otherPair<V>{
    private V value1;
    private V value2;

    public otherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
