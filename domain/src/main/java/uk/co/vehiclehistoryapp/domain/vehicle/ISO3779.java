package uk.co.vehiclehistoryapp.domain.vehicle;

/**
 * Created with IntelliJ IDEA.
 * User: jamesgreen
 * Date: 07/12/2013
 * Time: 23:17
 * To change this template use File | Settings | File Templates.
 */
public class ISO3779 implements VIN {
    private String wmi;
    private String vds;
    private String vis;

    @Override
    public void parse(String value) throws InvalidVINException {
        if (value == null || value.length() != 17) {
            throw new InvalidVINException("Value must be 17 chars long.");
        }
        wmi = value.substring(0, 2);
        vds = value.substring(3, 8);
        vis = value.substring(9, 16);
    }

    @Override
    public String toString() {
        return new StringBuilder().append(wmi).append(vds).append(vis).toString();
    }
}
