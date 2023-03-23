package basepatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VehicleCollection implements Vehicle {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public void accept(Visitor visitor) {
        for (Vehicle vehicle : vehicles) {
            vehicle.accept(visitor);
        }
    }
}
