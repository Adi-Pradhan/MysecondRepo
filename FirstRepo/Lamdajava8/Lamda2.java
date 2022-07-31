package Lamdajava8;
@FunctionalInterface
interface try123{
    String erty( );
}
public class Lamda2 {
    public static void main(String[] args) {
        try123 ty=()->{
            return "aditya";
        };
        String sw=ty.erty();
        System.out.println(sw);
    }
}
