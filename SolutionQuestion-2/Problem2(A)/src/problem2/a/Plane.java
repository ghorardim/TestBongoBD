
package problem2.a;


public class Plane implements Vehicle{
    
    private int wheels = 3;
    private int passengers = 100;
    private int gas = 100;

    @Override
    public int set_num_of_wheels() {
        return wheels;
    }

    @Override
    public int set_num_of_passengers() {
        return passengers;
    }

    @Override
    public boolean has_gas() {
        if(gas>0){
            return true; 
        } 
        else{
            return false;
        } 
    }
    
}
