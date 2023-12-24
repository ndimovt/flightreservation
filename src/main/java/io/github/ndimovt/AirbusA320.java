package io.github.ndimovt;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class AirbusA320 extends Plane{
    private FileReader fileReaderr;
    private BufferedReader bufferedReader;
    public void readFile(){
        try {
            fileReaderr = new FileReader("C:\\Users\\Nikolai\\IdeaProjects\\flightreservation\\src\\main\\java\\io\\github\\ndimovt\\planefiles\\AirbusA320.txt");
            bufferedReader = new BufferedReader(fileReaderr);
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            close(fileReaderr, bufferedReader);
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

