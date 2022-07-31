import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInSt {
    public static void main(String[] args) {
        try{
        FileInputStream fi1=new FileInputStream("note.txt");
        FileInputStream f=new FileInputStream("note.txt");
        SequenceInputStream si= new SequenceInputStream(fi1,f);

        int j;
        while((j=si.read()) !=-1){
            System.out.println((char)j);
        }
        fi1.close();
        f.close();
        si.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
