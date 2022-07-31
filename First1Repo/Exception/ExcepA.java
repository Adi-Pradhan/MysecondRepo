public class ExcepA {
    public static void main(String[] args) {
        try{
            System.out.println(23/0);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
