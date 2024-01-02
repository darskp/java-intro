package Java_Files;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
        File file=new File("demo.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}