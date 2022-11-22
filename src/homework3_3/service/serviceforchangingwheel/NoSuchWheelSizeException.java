package homework3_3.service.serviceforchangingwheel;

public class NoSuchWheelSizeException extends Exception{
    private final String message;

    public NoSuchWheelSizeException(String message){
        this.message = message;
    }
}
