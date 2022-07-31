package Lamdajava8;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Lamda4 {
   public static void main(String[] args) {
       List<Integer> l=new ArrayList<>();
       l.add(123);
       l.add(12);
       l.add(432);
       l.add(765);
       l.add(68);

       l.sort((a,b)->{
           if(a<b){
               return-1;
           }
           return 0;
       });
       l.forEach(System.out::println);
       l.forEach(e->{
           System.out.println(e);
    });
   }


}
