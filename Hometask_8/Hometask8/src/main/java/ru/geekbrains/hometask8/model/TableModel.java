package ru.geekbrains.hometask8.model;

import ru.geekbrains.hometask8.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     */
    public Collection<Table> loadTables() {

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя
     */
    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table: tables) {
            if (table.getTableNo() == tableNo){
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Ошибка бронирования столика. Повторите попытку позже.");
    }

    /**
     * Отмена бронирования столика
     *
     * @param oldReservation id бронирования, которое нужно отменить
     */
    @Override
    public int closeReservationTable(int oldReservation) {
       //List<Reservation> reservation = (ArrayList<Reservation>) tables.getReservations();
        for (Table table : tables) {
            if (table.getReservations().stream().findFirst().get().getId() == oldReservation) {
//                Reservation reservation = table.get()
//                table.getReservations().remove(table.getReservations().get(oldReservation));
                System.out.println(oldReservation + "Найдено!");
                return oldReservation;
            }
        }
        throw new RuntimeException("Ошибка отмены бронирования столика. Повторите попытку позже.");
    }

    /**
     * TODO: Доработать самостоятельнов рамках домашней работы
     * @param oldReservation id бронирования
     * @param reservationDate новая дата бронирования
     * @param tableNo новый номер столика
     * @param name новое имя посетителя
     * @return код успешного выполнения операции, либо код ошибки
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        return -1;
    }

}
