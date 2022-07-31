package Lamdajava8;

@FunctionalInterface
interface trya{
    String erty(String s );
}

public class Lamda3 {
    public static void main(String[] args) {
        trya aq=(s) -> {
            return s+"deep";
        };
        System.out.println(aq.erty("adii"));
    }
}
