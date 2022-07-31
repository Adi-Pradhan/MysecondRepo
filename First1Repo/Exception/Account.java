public class Account {
    public static void main(String[] args) {
        try {
            withdraw();
        } catch (Customized e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void withdraw() throws Customized {
      
            int bal=123;
            System.out.println((bal=bal-500));
            if(bal<0){
            throw new Customized("InsufficientBalanceException");
            }
        
        
    }
}
class Customized extends Exception{
    public Customized(String string){
        super(string);
    }
}
