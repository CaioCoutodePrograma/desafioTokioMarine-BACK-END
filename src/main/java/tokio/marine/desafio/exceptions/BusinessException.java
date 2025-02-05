package tokio.marine.desafio.exceptions;


public class BusinessException extends RuntimeException{

    public BusinessException(String message){
        super(message);
    }

}