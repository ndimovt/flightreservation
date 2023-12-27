package io.github.ndimovt.planes;

import io.github.ndimovt.ReadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Plane implements ReadFile {
    private FileReader fr;
    private BufferedReader bfr;
    public void read() {
        try {
            fr = new FileReader("C:\\Users\\Nikolai\\IdeaProjects\\flightreservation\\src\\main\\java\\io\\github\\ndimovt\\planefiles\\defPlane.txt");
            bfr = new BufferedReader(fr);
            String line;
            while((line = bfr.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException fne){
            fne.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }
        finally {
            close(fr,bfr);
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
