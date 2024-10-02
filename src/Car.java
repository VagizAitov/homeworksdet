public class Car implements AbleToRide{
    private int mileage = 0;
    public static boolean ableToTuning = true;
    public static String[] typesOfSteeringWheels = new String[] {"Rack", "Telescopic", "Adjustable"};
    public Car(){}
    public void ride(){
        setMileage(getMileage()+10);
    }
    public int getRideDistance(){
        return mileage;
    }
    public void setMileage(int milage){
        this.mileage = milage;
    }
    public int getMileage(){
        return mileage;
    }

}
