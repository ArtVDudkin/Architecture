package ru.geekbrains.hometask8.model;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;
    private final int id;

    private Table table;
    private Date date;
    private String name;

    {
        id = ++counter;
    }

    public Reservation(Table table, Date date, String name) {
        this.table = table;
        this.date = date;
        this.name = name;
    }

    public int getId() {
        return id;
    }

}
