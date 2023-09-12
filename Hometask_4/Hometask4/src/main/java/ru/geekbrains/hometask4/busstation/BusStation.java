package ru.geekbrains.hometask4.busstation;

import ru.geekbrains.hometask4.core.*;

/**
 * Автобусная станция
 */
public class BusStation {

    private final TicketProvider ticketProvider;

    public BusStation(TicketProvider ticketProvider){
        this.ticketProvider = ticketProvider;
    }

    public boolean checkTicket(String qrCode){
        return ticketProvider.checkTicket(qrCode);
    }

}
