import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class FileIPOU {
    public static void main(String[] args) {
        try{
            PipedInputStream pi=new PipedInputStream();
            PipedOutputStream po=new PipedOutputStream();
            pi.connect(po);
            po.write(65);
            System.out.println((char)pi.read());
            pi.close();
            po.close();
        }
       catch(Exception e){
           e.printStackTrace();
       }

    }
}

