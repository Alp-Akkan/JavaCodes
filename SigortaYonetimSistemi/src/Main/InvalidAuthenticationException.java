package Main;

public class InvalidAuthenticationException extends Exception {
    public InvalidAuthenticationException(String error) {
        super(error);
    }

}