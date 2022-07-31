package Lamdajava8;
@FunctionalInterface
interface try12{
    void ert();
}


public class Lamda1 {
    public static void main(String[] args) {
        try12 tr= () -> {
            System.out.println("adityapradjan");
        };
        //System.out.println(tr.ert);
        tr.ert();
       
    }
}
