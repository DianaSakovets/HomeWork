package homework3_3.service.serviceforchangingwheel;

public class SuchWheelSizeAlreadyExists extends Exception{
    private final String message;

    public SuchWheelSizeAlreadyExists(String message){
        this.message = message;
    }
}
