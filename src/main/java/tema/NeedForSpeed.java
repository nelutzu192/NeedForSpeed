package tema;



class NeedForSpeed {

    int speed = 5;
    int batteryDrain = 2;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;

    }


    public boolean batteryDrained() {
        return (batteryDrain <= 0);
    }

    public int distanceDriven() {
        return speed;
    }

    /*
    Cars start with full (100%) batteries. Each time you drive the car using the remote control,
    it covers the car's speed in meters and decreases the remaining battery percentage by its battery drain.
     */
    public void drive() {

        System.out.println("Driving" + speed + " meters");
        batteryDrain = batteryDrain - batteryDrain;

    }

    /*
    The best-selling remote control car is the Nitro, which has a stunning top speed of 50 meters with
    a battery drain of 4%. Implement the (static) NeedForSpeed.nitro() method to return this type of car:
     */
    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50, 4);
        return nitro;
    }
}

class RaceTrack {
    int distance = 800;

    // TODO: define the constructor for the 'RaceTrack' class
    public RaceTrack(int distance) {
        this.distance = distance;

    }

    /*
    To finish a race, a car has to be able to drive the race's distance. This means not draining its
    battery before having crossed the finish line. Implement the RaceTrack.carCanFinish() method that
    takes a NeedForSpeed instance as its parameter and returns true if the car can finish the race;
    otherwise, return false:
    */
    public boolean carCanFinish(NeedForSpeed car) {
        double distanceWithBatery = car.speed/car.batteryDrain;

        if (distanceWithBatery >= distance){
            return true;
        } else{
            return false;
        }

    }
}
