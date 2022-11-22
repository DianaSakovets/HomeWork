package homework3_3.service.serviceforchangingcolor;

public class SuchColorAlreadyExists extends Exception{
    private final String message;

    public SuchColorAlreadyExists(String message){
        this.message = message;
    }
}
