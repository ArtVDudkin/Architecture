package ru.geekbrains.hometask4.core;

public class CustomerProvider {

    private Database database;

    public CustomerProvider(Database database) {
        this.database = database;
    }

    public Customer getCustomer(String login, String password) {
        Customer customer = new Customer();
        database.addCustomer(customer, new Ticket());
        return customer;
    }

}
