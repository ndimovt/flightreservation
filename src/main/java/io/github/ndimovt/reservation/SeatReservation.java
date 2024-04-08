package io.github.ndimovt.reservation;

import io.github.ndimovt.Human;
import io.github.ndimovt.Passenger;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class SeatReservation implements Runnable{
    private Scanner inn = new Scanner(System.in);
    private String seat;
    public SeatReservation(String seat) {
        this.seat = seat;
    }
    public void run(){
        synchronized (seat) {
            Supplier<Integer> ticketCode = () -> new Random().nextInt();
            System.out.println("Enter your name");
            String firstName = inn.nextLine();
            System.out.println("Enter your father name");
            String fatherName = inn.nextLine();
            System.out.println("Enter your surname");
            String surname = inn.nextLine();
            Human passenger = new Passenger(firstName, fatherName, surname, seat, code(ticketCode));
            FlightInformation.getRes().put(seat, (Passenger)passenger);
            System.out.println(seat + " Successfully reserved.");
        }
    }
    private int code(Supplier<Integer> number){
        return number.get();
    }
}
