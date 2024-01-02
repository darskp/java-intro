package Java_Files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("demo.txt", true)) {
            writer.write("Darshan");
            System.out.println("File modified successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
