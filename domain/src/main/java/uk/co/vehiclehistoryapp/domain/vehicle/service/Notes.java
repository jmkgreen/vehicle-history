package uk.co.vehiclehistoryapp.domain.vehicle.service;

import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jamesgreen
 * Date: 07/12/2013
 * Time: 23:52
 * To change this template use File | Settings | File Templates.
 */
public class Notes implements Iterable<Note> {
    private List<Note> notes;

    @Override
    public Iterator<Note> iterator() {
        return notes.listIterator();
    }
}
