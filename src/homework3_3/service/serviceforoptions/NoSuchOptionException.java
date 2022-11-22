package homework3_3.service.serviceforoptions;

public class NoSuchOptionException extends Exception{
    private final String message;

    public NoSuchOptionException(String message){
        this.message = message;
    }
}
