
package problem2.a;


public class Problem2A {

    
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle =  vehicleFactory.getVehicle("car");
        if(vehicle != null){
            System.out.println("number of wheels: "+vehicle.set_num_of_wheels());
            System.out.println("number of passengers: "+vehicle.set_num_of_passengers());
            System.out.println("has gas: "+vehicle.has_gas());
        }
        Vehicle vehicle2 =  vehicleFactory.getVehicle("plane");
        if(vehicle != null){
            System.out.println("number of wheels: "+vehicle2.set_num_of_wheels());
            System.out.println("number of passengers: "+vehicle2.set_num_of_passengers());
            System.out.println("has gas: "+vehicle2.has_gas());
        }
    }
    
}
