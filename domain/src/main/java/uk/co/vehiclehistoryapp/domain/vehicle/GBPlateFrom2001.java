package uk.co.vehiclehistoryapp.domain.vehicle;

/**
 * Created with IntelliJ IDEA.
 * User: jamesgreen
 * Date: 07/12/2013
 * Time: 23:39
 * To change this template use File | Settings | File Templates.
 */
public class GBPlateFrom2001 implements Plate {
    private String value;
    @Override
    public void parse(String value) throws InvalidPlateException {
        if (value.isEmpty()) {
            throw new InvalidPlateException("Plate cannot be empty.");
        }
        if (value.length() != 7) {
            throw new InvalidPlateException("Plate must consist of 7 characters.");
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
