package uk.co.vehiclehistoryapp.domain.vehicle;

/**
 * Created with IntelliJ IDEA.
 * User: jamesgreen
 * Date: 07/12/2013
 * Time: 23:11
 * To change this template use File | Settings | File Templates.
 */
public class InvalidVINException extends Exception {
    public InvalidVINException(String message) {
        super(message);
    }

    public InvalidVINException(String message, Throwable cause) {
        super(message, cause);
    }
}
