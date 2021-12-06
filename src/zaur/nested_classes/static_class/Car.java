package zaur.nested_classes.static_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        int countOfObject = Engine.countOfObject;
        Engine engine = new Engine(200);
        int horsPower = engine.horsPower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        private int horsPower;
        static int countOfObject;

        public Engine(int horsPower) {
//            System.out.println(a);
            this.horsPower = horsPower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsPower=" + horsPower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}
