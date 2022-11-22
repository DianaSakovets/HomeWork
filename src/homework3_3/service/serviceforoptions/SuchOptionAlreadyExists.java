package homework3_3.service.serviceforoptions;

public class SuchOptionAlreadyExists extends Exception{
    private final String message;

    public SuchOptionAlreadyExists(String message){
        this.message = message;
    }
}
