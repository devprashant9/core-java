package Day_14_FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File Name: ");
        String fileName = sc.nextLine();

        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.println((char) read);
            } while (read != -1);
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        sc.close();
    }
}
