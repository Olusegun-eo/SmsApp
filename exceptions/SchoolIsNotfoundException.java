package exceptions;

public class SchoolIsNotfoundException extends Throwable {

    public SchoolIsNotfoundException(String s) {
//        They all extends Throwable directly or indirectly
//        Either from Class or error
//        custom exception always implements 4 methods

//        Types of exception: Check Exception AND uncheck EXception
//        run time error= uncheck Exception:    compile time error===check Exception


    }

    public SchoolIsNotfoundException() {
        super();
    }

    public SchoolIsNotfoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SchoolIsNotfoundException(Throwable cause) {
        super(cause);
    }

    protected SchoolIsNotfoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
