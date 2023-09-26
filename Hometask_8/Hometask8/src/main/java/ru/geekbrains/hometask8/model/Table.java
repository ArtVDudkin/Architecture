package ru.geekbrains.hometask8.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    private final Collection<Reservation> reservations = new ArrayList<>();

    private static int counter;
    private final int no;

    {
        no = ++counter;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }

}
