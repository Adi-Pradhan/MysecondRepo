import java.io.Closeable;
import java.io.IOException;

public class Exception3 implements Closeable {
    

   

    @Override
    public void close() throws IOException {
        System.exit(0);
    }
}
