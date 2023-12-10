package io.github.ndimovt;

import java.util.Scanner;

public class SeatReservation implements Runnable{
    private Scanner inn = new Scanner(System.in);
    private String seat;
    public SeatReservation(String seat) {
        this.seat = seat;
    }

    public void run(){
        synchronized (seat) {
            if (FlightInformation.getRes().containsKey(seat)) {
                System.out.println("Seat already reserved! Please chose another one.");
            } else {
                System.out.println("Enter your name");
                String name = inn.nextLine();
                FlightInformation.getRes().put(seat, name);
                System.out.println(seat + " Successfully reserved.");
            }
        }
    }

}
