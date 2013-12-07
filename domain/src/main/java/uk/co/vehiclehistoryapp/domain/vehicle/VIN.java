package uk.co.vehiclehistoryapp.domain.vehicle;

/**
 * Created with IntelliJ IDEA.
 * User: jamesgreen
 * Date: 07/12/2013
 * Time: 23:08
 * To change this template use File | Settings | File Templates.
 */
public interface VIN {

    public void parse(String value) throws InvalidVINException;

    public String toString();
}
