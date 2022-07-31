import java.util.ArrayList;
import java.util.List;

public class Comparable1 implements Comparable{
    public static void main(String[] args) {
        List<Integer> ab=new ArrayList<>();
        ab.add(12);
        ab.add(34);
        ab.add(65);
        ab.forEach(System.out::println);
    }

    @Override
    public int compareTo(Object o) {
        if(ab<ab){
            return -1;
        }
        return 0;
    }
}
