public class ExcepB {
    public static void main(String[] args) {
        try{
            System.out.println("aditya");
            try{
                System.out.println(34/0);
            }catch(ArithmeticException e){
                e.printStackTrace();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
