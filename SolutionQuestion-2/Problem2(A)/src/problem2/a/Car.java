package problem2.a;

public class Car implements Vehicle {

    private int wheels = 4;
    private int passengers = 4;
    private int gas = 10;

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
        if (gas > 0) {
            return true;
        } else {
            return false;
        }
    }

}
