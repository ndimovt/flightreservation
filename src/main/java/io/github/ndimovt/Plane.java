package io.github.ndimovt;

public class Plane {
    public Plane(int seatCount) {
        for (int i = 1; i <=seatCount ; i++) {
            System.out.println(i+"A|"+i+"B|"+i+"C      "+i+"D|"+i+"E|"+i+"F");
        }
    }

}
