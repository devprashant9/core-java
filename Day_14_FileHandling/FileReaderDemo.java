package Day_14_FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\kumar\\Desktop\\CoreJava\\Day_14_FileHandling\\java.txt";

        try(FileReader reader = new FileReader(fileName)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char)read);
            } while(read != -1);
        } catch(IOException exception) {
            System.out.println("Exception");
        }
    }
}
