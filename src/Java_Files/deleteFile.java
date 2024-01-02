package Java_Files;

import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
         File file = new File("demo.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
