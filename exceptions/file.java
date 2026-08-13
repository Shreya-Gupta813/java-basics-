package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class file {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\shrit\\OneDrive\\Desktop\\text.txt";
        try (BufferedReader read = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = read.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cant locate file");
        } catch (

        IOException e) {
            System.out.println("cannot write :(");
        }
    }
}
