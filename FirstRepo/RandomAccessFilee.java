import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFilee {
    public static void main(String[] args) {
        try{
        RandomAccessFile raf=new RandomAccessFile("note.txt","rw");
        raf.seek(1);
        //System.out.print(b);
        // System.out.println(raf.read()); 
        // System.out.println(raf.readUTF().toString());
        System.out.println(raf.readLine());
        // System.out.println(raf.readInt());
        // raf.write(34);
            // raf.writeDouble(34.45);
        //     raf.writeFloat(23.43f);
            // System.out.println(raf.length());
            raf.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
