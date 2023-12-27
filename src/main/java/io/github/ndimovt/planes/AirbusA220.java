package io.github.ndimovt.planes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AirbusA220 extends Plane{
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    @Override
    public void read() {
        try {
            fileReader = new FileReader("C:\\Users\\Nikolai\\IdeaProjects\\flightreservation\\src\\main\\java\\io\\github\\ndimovt\\planefiles\\AirbusA220.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fne) {
            fne.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            close(fileReader, bufferedReader);
        }
    }
    private void close(FileReader fr, BufferedReader bfr){
        try {
            if (fr != null) {
                fr.close();
            }
            if (bfr != null) {
                bfr.close();
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
