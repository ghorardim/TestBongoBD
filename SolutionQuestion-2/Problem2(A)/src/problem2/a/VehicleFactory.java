
package problem2.a;


public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }else if(vehicleType.equalsIgnoreCase("PLANE")){
            return new Plane();
        }
        return null;
    }
}
