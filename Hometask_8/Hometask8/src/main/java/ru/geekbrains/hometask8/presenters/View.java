package ru.geekbrains.hometask8.presenters;

import ru.geekbrains.hometask8.model.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Отобразить результат бронирования столика
     * @param reservationNo номер брони
     */
    void showReservationTableResult(int reservationNo);


    /**
     * Установить наблюдателя для представления
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    /**
     * Событие: Клиент нажал на кнопку резерва столика
     * @param orderDate дата резерва
     * @param tableNo номер столика
     * @param name Имя клиента
     */
    void reservationTable(Date orderDate, int tableNo, String name);

    void closeReservationTable(int oldReservation);

    void changeReservationTable(int oldReservation, Date date, int tableNo, String name);
}
