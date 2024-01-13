package io.github.ndimovt;

import io.github.ndimovt.planes.AirbusA220;
import io.github.ndimovt.planes.AirbusA320;
import io.github.ndimovt.planes.Plane;
import io.github.ndimovt.reservation.FlightInformation;
import io.github.ndimovt.reservation.SeatReservation;

import java.util.Scanner;

public class UserMenu {
    private Scanner inn = new Scanner(System.in);
    private Plane plane;
    public void menuChoice(){
        planeChoice();
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
    private void planeChoice(){
        int num = (int) (Math.random()*2);
        switch (num){
            case 0:
                plane = new AirbusA220();
                plane.read();
                break;
            case 1:
                plane = new AirbusA320();
                plane.read();
                break;
            default:
                plane = new Plane();
                plane.read();
                break;
        }
    }
}
