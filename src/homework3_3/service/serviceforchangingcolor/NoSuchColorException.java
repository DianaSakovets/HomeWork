package homework3_3.service.serviceforchangingcolor;

public class NoSuchColorException extends Exception{
    private final String message;
    public NoSuchColorException(String message){
        this.message = message;
    }
}
