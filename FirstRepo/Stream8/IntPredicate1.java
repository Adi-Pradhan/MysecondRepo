package Stream8;

import java.util.function.DoubleFunction;
import java.util.function.IntPredicate;

interface daf{
    public default void mss() {
        System.out.println("rase");
    }
    public static void maa() {
        System.out.println("zebra");
    }
}

public class IntPredicate1 implements daf {

    static DoubleFunction<mass> dff = new DoubleFunction<mass>() {

        @Override
        public mass apply(double value) {
            if(value == 0) {
                return null;
            }
            return new mass();
        } 
    };
    public static void main(String[] args) {
        // Integer value=45;
        IntPredicate iy= (value)->{
            if(value%2==0){
                return true;
            }
            return false;
        };

         // func for double -> Generic
    
        mass c=dff.apply(1232);
        System.out.println(c.is);

    }
    
    
}
class mass{
    static IntPredicate1 is=new IntPredicate1();
    // public static void main(String[] args) {
    //     is.mss();
    //     daf.maa();
    // }
}