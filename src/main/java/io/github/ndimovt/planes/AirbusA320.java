package io.github.ndimovt.planes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AirbusA320 extends Plane {
    private final String LOCATION = "C:\\Users\\Nikolai\\IdeaProjects\\flightreservation\\src\\main\\java\\io\\github\\ndimovt\\planefiles\\AirbusA320.txt";
    private Path filePath;
    @Override
    public void read() {
        try {
            filePath = Paths.get(LOCATION);
            List<String> line = Files.readAllLines(filePath);
            showSeat(line);
        } catch (FileNotFoundException fne) {
            fne.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
    @Override
    public void showSeat(List <String> seatMap){
        for (String seat: seatMap) {
            System.out.println(seat);
        }
    }
}

