package Stream8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
       l.add(123);
       l.add(12);
       l.add(432);
       l.add(765);
       l.add(68);
       l.add(12);
      // l.stream().filter(e->(e%2==0)).collect(Collectors.toList()).forEach(System.out::println);
        Stream<Integer> st=l.stream();
        //System.out.println(st.count());
        //System.out.println(st.findAny());
        // System.out.println(st.findFirst());
        /*st.sorted((a,b)->{
            if(a<b){
                return -1;
            }
            return 0;
        }).forEach(System.out::println);*/
        /*int m=st.min((a,b)->{
            if(a<b){
            return -1;
            }
            return 0;
        }).get();
        System.out.println(m);*/
        /*int max=st.max((a,b)->{
            if(a>b){
                return 1;
            }
            return -1;
        }).get();
        System.out.println(max);*/

       /* Stream so=st.distinct();
        so.forEach(System.out::println);*/

        /*Stream so= st.limit(4);
        so.forEach(System.out::println);*/

       /* Stream so= st.skip(3);
        so.forEach(System.out::println);*/

        /*Stream<Integer> so =st.map(e -> e * 2);
        so.forEach(System.out::println);*/
        /*Stream<Integer> so =st.map(e -> {
        if(e>500){
            return e;
        }
        return 0;
        });
        so.forEach(System.out::println);*/

       /* boolean b=st.allMatch(e->e%2==0);
        System.out.println(b);*/
       /* boolean b=st.allMatch(e->e>0);
        System.out.println(b);*/
        // boolean bv=st.anyMatch(e->e%2==0);
        // System.out.println(bv);
        boolean bv=st.noneMatch(e->e%2==0);
        System.out.println(bv);
    }
}
