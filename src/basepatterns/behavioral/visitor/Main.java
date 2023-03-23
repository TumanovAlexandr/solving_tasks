package basepatterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        VehicleCollection vehicleCollection = new VehicleCollection();
        vehicleCollection.addVehicle(new Car());
        vehicleCollection.addVehicle(new Bike());

        Visitor visitor = new ServiceVisitor();
        vehicleCollection.accept(visitor);
        // Output: Service for Car
        //         Service for Bike
    }
}
