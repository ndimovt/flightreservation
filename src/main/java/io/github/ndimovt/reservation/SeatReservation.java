package io.github.ndimovt.reservation;

import io.github.ndimovt.Human;
import io.github.ndimovt.Passenger;

import java.util.Scanner;

public class SeatReservation implements Runnable{
    private Scanner inn = new Scanner(System.in);
    private String seat;
    public SeatReservation(String seat) {
        this.seat = seat;
    }
    public void run(){
        synchronized (seat) {
            System.out.println("Enter your name");
            String firstName = inn.nextLine();
            System.out.println("Enter your father name");
            String fatherName = inn.nextLine();
            System.out.println("Enter your surname");
            String surname = inn.nextLine();
            Human passenger = new Passenger(firstName, fatherName, surname, seat, code());
            FlightInformation.getRes().put(seat, (Passenger)passenger);
            System.out.println(seat + " Successfully reserved.");
        }
    }
    private int code(){
        return (int) (Math.random()*999999999);
    }
}
