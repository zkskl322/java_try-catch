package exam26.exam.excp;

public class CustomException extends Exception{

    private static final long serialVersionUID = -3049530461562154302L;
    private String message;

    public CustomException() {

    }

    public CustomException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}