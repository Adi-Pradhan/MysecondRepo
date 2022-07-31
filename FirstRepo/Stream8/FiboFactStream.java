package Stream8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FiboFactStream {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<Integer>();
        
        Stream<Integer> as=ls.stream();
        ls.add(5);
        //as.forEach(new A());
        as.forEach(new A1());

        
    }
}
class A implements Consumer<Integer>{

    @Override
    public void accept(Integer t) {
        int sum=1;
        while (t > 0){
            sum=sum*t;
            t--;
        }
        System.out.println(sum);
    }
    
}
class A1 implements Consumer<Integer>{

    @Override
    public void accept(Integer t) {
        ArrayList<Integer> sd=new ArrayList<>();
        sd.add(0);
        sd.add(1);
        for(int i=0;i<t;i++){
          int  sum=sd.get(i)+sd.get(i+1);
          sd.add(sum);
        }
        sd.forEach(e->System.out.println(e));
    }
    
}