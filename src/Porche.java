import java.util.Arrays;

public class Porche extends Car implements TypeOfSteeringWheel {
    private int weight = 0;
    private String steeringWheel;
    private String model = "";


    public void setTypeOfSteeringWheel(String steeringWheel){
        if (!Arrays.asList(typesOfSteeringWheels).contains(steeringWheel)){
            return;
        }
        this.steeringWheel = steeringWheel;
    }
    public String getTypeOfSteeringWheel(){
        if(steeringWheel == null){
            return "This type of steering wheel is not available";
        }
        return steeringWheel;
    }
    public Porche(String model, int weight){
        this.model = model;
    }

    public static boolean isAbleToTuning() {
        return ableToTuning;
    }

}
