package uk.co.vehiclehistoryapp.domain.vehicle;

/**
 * Created with IntelliJ IDEA.
 * User: jamesgreen
 * Date: 07/12/2013
 * Time: 23:37
 * To change this template use File | Settings | File Templates.
 */
public class GenericStringPlate implements Plate {
    private String value;
    @Override
    public void parse(String value) throws InvalidPlateException {
        if (value.isEmpty()) {
            throw new InvalidPlateException("A plate must not be empty.");
        }

        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
