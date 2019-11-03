
package problem2.b;


public class Problem2B {

    
    public static void main(String[] args) {
        int distance = 1000;
        int passenger = 90;
        SelectVehicle selectVehicle = new SelectVehicle(new Car());
        selectVehicle.showVehicleDetails();
        if(distance > 400 && passenger > 4){
            selectVehicle = new SelectVehicle(new Plane());
            selectVehicle.showVehicleDetails();
        }
    }
    
}
