import java.util.Comparator;
import java.util.TreeSet;

public class Comparator1 {
    public static void main(String[] args) {
        TreeSet<String> mn=new TreeSet<>();
        mn.add("asdf");
        mn.add("awer");
      ((Object) mn).sort((a, b) -> {
            if(a<b){
                return -1;
            }
            return 0;
        });
    }
    // l.sort((a, b) -> {
    //     if(a.compareTo(b) > 0) {
    //         return -1;
    //     }
    //     return 0;
    // });

    // @Override
    // public int compare(Object o1, Object o2) {
        
    //     return 0;
    // }
}
