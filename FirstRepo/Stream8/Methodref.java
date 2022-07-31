package Stream8;

public class Methodref {
    static  int budhi(int a,int v){
        return (a+v);
    }
    static int sum(int d,int f){
        return budhi(d,f);
    }
   public static void main(String[] args) {
          System.out.println(sum(12,67)); 
   } 
}
