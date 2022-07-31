public class Thread1 {
    public static void main(String[] args) {
        Rty rr=new Rty();
        Rty1 r=new Rty1();
        Thread th= new Thread(rr);
        Thread th1= new Thread(r);
        th.start();
        th1.start();
    }
}
class Rty implements Runnable{

    @Override
    public void run() {
        System.out.println("aditya");
        
    }
    
}
class Rty1 implements Runnable{

    @Override
    public void run() {
        System.out.println("deepsh");
        
    }
    
}
