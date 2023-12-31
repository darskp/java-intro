package ExceptionHandling_.throws_.checked_compiler_known;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotfound_ {

  void getRead() throws FileNotFoundException{
    FileReader f = new FileReader("demo.txt");
  }
  public static void main(String[] args) {
    FileNotfound_ fclass=new FileNotfound_();
    try{
        fclass.getRead();
    }catch(FileNotFoundException e){
        System.out.println(e.getMessage());
    }
  }
}
