package Lamdajava8;



interface tryas{
    String erty( );
    String ertu( String s);
    void adidep();
}
public class Ananymous1 {
    public static void main(String[] args) {
        tryas wes=new tryas(){

            @Override
            public String erty() {
                
                return "adiDP";
            }

            @Override
            public String ertu(String s) {
                // TODO Auto-generated method stub
                return "ADityadeepshi";
            }

            @Override
            public void adidep() {
               System.out.println("lamda ka -----");
            }
            
        };
        System.out.println(wes.erty()+" "+wes.ertu("uli"));
        wes.adidep();
    }
}
