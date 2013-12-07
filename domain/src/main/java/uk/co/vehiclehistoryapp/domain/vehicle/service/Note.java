package uk.co.vehiclehistoryapp.domain.vehicle.service;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jamesgreen
 * Date: 07/12/2013
 * Time: 23:53
 * To change this template use File | Settings | File Templates.
 */
public class Note {

    private Date recordedAt;
    private String value;

    public Date getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(Date recordedAt) {
        this.recordedAt = recordedAt;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
