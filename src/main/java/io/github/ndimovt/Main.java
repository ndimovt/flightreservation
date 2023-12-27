package io.github.ndimovt;

import io.github.ndimovt.planes.AirbusA220;
import io.github.ndimovt.planes.Plane;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        Plane airbusA220 = new AirbusA220();
        airbusA220.read();
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("1) Reserve place 2) Check passenger list 3) Exit");
            int choice = inn.nextInt();
            inn.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter seat");
                    String seat = inn.nextLine();
                    if (FlightInformation.getRes().containsKey(seat)) {
                        System.out.println("Seat already reserved! Please chose another one.");
                    }else {
                        SeatReservation seatReservation = new SeatReservation(seat);
                        Thread t = new Thread(seatReservation);
                        t.start();
                        try {
                            Thread.sleep(100000);
                        } catch (InterruptedException ie) {
                            ie.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    System.out.println(FlightInformation.getRes().entrySet());
                    break;
                case 3:
                    isTrue = false;
                    break;
                default:
                    System.out.println("Please enter valid number.");
                    break;
            }
        }
    }
}