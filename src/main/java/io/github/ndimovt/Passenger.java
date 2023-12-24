package io.github.ndimovt;

public class Passenger extends Human{
    private int ticketCode;
    private String seat;
    public Passenger(String name, String fathername, String surname, String seat, int ticketCode) {
        super(name, fathername, surname);
        this.seat = seat;
        this.ticketCode = ticketCode;
    }

    @Override
    public String toString() {
        return super.getName() +" "+ super.getFathername() +" "+ super.getSurname() +" | "+ seat +" | "+ ticketCode;
    }
}
