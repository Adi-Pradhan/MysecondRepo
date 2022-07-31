import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectSerialization2 {
    public static void main(String[] args) {
        try{
        FileOutputStream fii=new FileOutputStream("note.txt");
        ObjectOutputStream ous=new ObjectOutputStream(fii);
        ObjectSerialization oo=new ObjectSerialization(22, "aditya", true, 75);
        ous.writeObject(oo);
        fii.close();
        ous.flush();
        ous.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
