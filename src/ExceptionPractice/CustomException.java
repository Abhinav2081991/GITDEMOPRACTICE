package ExceptionPractice;

public class CustomException extends Exception{

    public CustomException(String message){
        super(message);
    }

    public CustomException(){
        super();
    }

    public CustomException(String message, Throwable cause){
        super(message,cause);
    }




}
