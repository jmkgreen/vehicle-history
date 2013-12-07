package uk.co.vehiclehistoryapp.domain.vehicle;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jamesgreen
 * Date: 07/12/2013
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
public class Vehicle {

    private VIN vehicleIdentificationNumber;
    private Plate registrationPlate;
    private Date manufactured;

    public VIN getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(VIN vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public Plate getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(Plate registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public Date getManufactured() {
        return manufactured;
    }

    public void setManufactured(Date manufactured) {
        this.manufactured = manufactured;
    }
}
