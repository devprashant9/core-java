package Day_14_FileHandling;

import java.io.IOException;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\kumar\\Desktop\\CoreJava\\Day_14_FileHandling\\java.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Best Java Course.");
            writer.flush();
            System.out.println("File Written Successfully");
        } catch(IOException exception) {
            System.out.println("Exception Occurred: " +exception.getMessage());
        } 
        }
    }
