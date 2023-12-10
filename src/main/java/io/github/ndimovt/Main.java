package io.github.ndimovt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        new Plane(20);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("1) Reserve place 2) Check passenger list 3) Exit");
            int choice = inn.nextInt();
            inn.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter seat");
                    String seat = inn.next();
                    SeatReservation r = new SeatReservation(seat);
                    Thread t = new Thread(r);
                    t.start();
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException ie) {
                            ie.printStackTrace();
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