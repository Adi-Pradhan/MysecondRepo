import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Filehandaling {
    public static void main(String[] args) {
        try{
        File file=new File("note.txt");
       FileReader fr=new FileReader(file); 
       boolean read=true;
       String sr=" ";
       while(read==true){
          int m= fr.read();
          if(m==-1){
              read=false;
              break;
          }
          char ch=(char)m;
          sr=sr+ch;
       }
       System.out.println(sr);
       fr.close();
       FileWriter write=new FileWriter(file);
       write.append(sr+"deepshi");
       write.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
