package io.github.ndimovt.reservation;

import io.github.ndimovt.Passenger;

import java.util.HashMap;

public class FlightInformation {
    private static HashMap<String, Passenger> res = new HashMap<>();
    public static HashMap<String, Passenger> getRes() {
        return res;
    }
}
