package zaur.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {

    public static void main(String[] args) {
        List<Car> cars = createThreeCars(() -> new Car("Tesla", "blue", 2.5));
        System.out.println(cars);
        changeCar(cars.get(0), car -> {
            car.setColor("red");
            car.setEngine(3.0);
            System.out.println("upgraded " + car);
        });
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static List<Car> createThreeCars(Supplier<Car> carSupplier) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }
}


