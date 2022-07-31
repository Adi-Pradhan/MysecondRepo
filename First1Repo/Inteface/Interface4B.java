import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Interface4B {

    public static void main(String[] args) {
    Interface4 i1=new Interface4("adity", 7.01, 76.23);
    Interface4 i2=new Interface4("bishal", 5.76, 72.23);
    Interface4 i3=new Interface4("abinash", 7.45, 66.23);
    Interface4 i4=new Interface4("deep", 6.71, 46.23);
    Interface4 i5=new Interface4("adi", 6.89, 75.23);

    List<String> l=new ArrayList<>();
    l.add(i1.getName());
    l.add(i2.getName());
    l.add(i3.getName());
    l.add(i4.getName());
    l.add(i5.getName());

    l.sort((a, b) -> {
        if(a.compareTo(b) > 0) {
            return -1;
        }
        return 0;
    });

    for(String sd:l){
        System.out.println(sd);
    }
        
    }
    
}
class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Interface4 i1=(Interface4) o1;
        Interface4 i2=(Interface4) o2;
        String s1=i1.name;
        String s2=i2.name; 
        return s1.compareTo(s2);
    }
    
}
