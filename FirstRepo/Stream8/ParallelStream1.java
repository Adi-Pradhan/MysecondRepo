package Stream8;

import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream1 {
  public static void main(String[] args) {
      File f=new File("note.txt");
      try{
         List<String> ls= Files.readAllLines(f.toPath());
         Stream<String> s=ls.parallelStream().parallel();
         s.forEach(e->{
             System.out.println(e);
         });
      }
      catch(Exception e){
          e.printStackTrace();
      }
  }  
}
