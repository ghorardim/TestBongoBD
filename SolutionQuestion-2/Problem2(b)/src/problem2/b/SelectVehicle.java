package problem2.b;

public class SelectVehicle {

    private final Vehicle vehicle;

    public SelectVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void showVehicleDetails() {
        System.out.println("number of wheels: " + vehicle.set_num_of_wheels());
        System.out.println("number of passengers: " + vehicle.set_num_of_passengers());
        System.out.println("has gas: " + vehicle.has_gas());
    }
}
