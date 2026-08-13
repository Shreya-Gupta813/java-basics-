package exceptions;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;

public class MusicPlayer {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\shrit\\OneDrive\\Desktop\\java-basics-\\exceptions\\Rabba Heropanti 320 Kbps (1).wav";
        File file = new File(filepath);
        Scanner s = new Scanner(System.in);
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response = "";
            while (!response.equals("Q")) {
                System.out.println("P:Play");
                System.out.println("S:Stop");
                System.out.println("R:Reset");
                System.out.println("Q:Quit");
                System.out.print("Enter your choice: ");
                response = s.nextLine().toUpperCase();
                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice!!");
                }
            }

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("unable to access audio source");
        } catch (IOException e) {
            System.out.println("Something went wrong!!");
        } finally {
            System.out.println("Bye!!!");
            s.close();
        }
    }
}
