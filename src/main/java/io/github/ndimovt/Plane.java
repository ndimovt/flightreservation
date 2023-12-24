package io.github.ndimovt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Plane {
    private FileReader fr;
    private BufferedReader bfr;
    public void readFiile() {
        try {
            fr = new FileReader("C:\\Users\\Nikolai\\IdeaProjects\\flightreservation\\src\\main\\java\\io\\github\\ndimovt\\planefiles\\defPlane.txt");
            bfr = new BufferedReader(fr);
            String line;
            while((line = bfr.readLine()) != null){
                System.out.println(line);
            }
            close(fr,bfr);
        }catch (FileNotFoundException fne){
            fne.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
    private void close(FileReader fr, BufferedReader bfr) throws IOException{
        if(fr != null){
            fr.close();
        }
        if(bfr != null){
            bfr.close();
        }
    }

}
