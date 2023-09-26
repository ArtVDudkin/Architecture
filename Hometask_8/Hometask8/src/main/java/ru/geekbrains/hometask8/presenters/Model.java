package ru.geekbrains.hometask8.presenters;

import ru.geekbrains.hometask8.model.Table;
import ru.geekbrains.hometask8.model.User;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(User user, Date reservationDate, int tableNo, String name);

    int closeReservationTable(User user, int oldReservation);

}
