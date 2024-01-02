package Java_Files;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

  public static void main(String[] args) {
    try {
      FileReader fr = new FileReader("demo.txt");
      BufferedReader br = new BufferedReader(fr);
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
