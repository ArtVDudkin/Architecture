package ru.geekbrains.hometask8;

import ru.geekbrains.hometask8.model.TableModel;
import ru.geekbrains.hometask8.presenters.BookingPresenter;
import ru.geekbrains.hometask8.presenters.Model;
import ru.geekbrains.hometask8.presenters.View;
import ru.geekbrains.hometask8.views.BookingView;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2, "Станислав");

        //view.changeReservationTable(1001, new Date, 3, "Станислав");

    }

}
