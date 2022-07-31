public class ExcepD {
    public static void main(String[] args) {
        try{
            System.out.println(12/0);
        }
        finally{
            System.out.println("inside finally block");
        }
    }
}
