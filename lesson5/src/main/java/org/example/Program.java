package org.example;

import org.example.models.TableModel;
import org.example.presenters.BookingPresenter;
import org.example.views.BookingView;

import java.util.Date;

    public class Program {

        /**
         * TODO: ДОМАШНЯЯ РАБОТА
         * Метод changeReservationTable должен ЗАРАБОТАТЬ!
         *
         * @param args аргументы командной строки
         */
        public static void main(String[] args) {
            TableModel tableModel = new TableModel();
            BookingView bookingView = new BookingView();
            BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
            bookingPresenter.loadTables();
            bookingPresenter.updateView();

            bookingView.reservationTable(new Date(), 3, "Станислав");

            bookingView.changeReservationTable(1001, new Date(), 2, "Станислав");
        }


    }

