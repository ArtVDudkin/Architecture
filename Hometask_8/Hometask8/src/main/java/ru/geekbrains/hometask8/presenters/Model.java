package ru.geekbrains.hometask8.presenters;

import ru.geekbrains.hometask8.model.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    int closeReservationTable(int oldReservation);

}
