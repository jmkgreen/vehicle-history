package uk.co.vehiclehistoryapp.domain.vehicle;

/**
 * Created with IntelliJ IDEA.
 * User: jamesgreen
 * Date: 07/12/2013
 * Time: 23:37
 * To change this template use File | Settings | File Templates.
 */
public class InvalidPlateException extends Exception {
    public InvalidPlateException(String message) {
        super(message);
    }

    public InvalidPlateException(String message, Throwable cause) {
        super(message, cause);
    }
}
