package Stream8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Groupingpartionning {
    static List<Aditya1> li=new ArrayList<>();
    static{
        Aditya1 a1=new Aditya1(6, 2300, "dev", 76);
        Aditya1 a2=new Aditya1(6, 2300, "dev", 73);
        Aditya1 a3=new Aditya1(6, 2000, "test", 78);
        Aditya1 a4=new Aditya1(6, 3300, "cloud", 71);
        Aditya1 a5=new Aditya1(6, 2000, "test", 75);
        Aditya1 a6=new Aditya1(6, 3300, "cloud", 74);
        li.add(a1);
        li.add(a2);
        li.add(a3);
        li.add(a4);
        li.add(a5);
        li.add(a6);
    }
    public static void main(String[] args) {
        li.stream().collect(Collectors.groupingBy(Aditya1::getJob))
        .forEach((k,v)->{
            System.out.println(k);
            v.forEach(e->{
                System.out.println(e.sal);
            });
        });
        li.stream().collect(Collectors.partitioningBy(e->e.sal>=2300.00))
        .forEach((k,v)->{
            if(k==false){
                System.out.println("whose income below 2300 are:");
                v.forEach(e->{System.out.println(e.weight);});
            }
            else{
                System.out.println("whose greater then that:");
                v.forEach(e->{
                    System.out.println(e.weight);
                });
            }
        });
    }
}
