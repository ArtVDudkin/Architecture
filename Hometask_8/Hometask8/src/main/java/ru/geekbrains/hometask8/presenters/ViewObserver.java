package ru.geekbrains.hometask8.presenters;

import ru.geekbrains.hometask8.model.User;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(User user, Date orderDate, int tableNo, String name);

    void onChangeReservationTable(User user, int oldReservation, Date reservationDate, int tableNo, String name);

    void onCloseReservationTable(int oldReservation);

}
