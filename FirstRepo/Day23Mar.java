import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Day23Mar {
    public static void main(String[] args) {
        Day23S d=new Day23S(13,"ad",34);
        try{
        File file=new File("note.txt");
       FileReader fr=new FileReader(file);
       FileWriter write=new FileWriter(file);
       String s=d.getName();
       int ma=d.getAge();
       int saa=d.getSalary();
       write.append(s+ " "+ma+" "+saa);
       write.close(); 
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
       
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
