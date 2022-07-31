class Interface3 implements Cloneable{
    String date_of_birt = null;
    public Interface3(String args){
        this.date_of_birt=args;
    }
    public static void main(String[] args) {

        try{
            Interface3 empp=new Interface3("12-34-2000");
        System.out.println(empp.clone().toString()) ;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return "Interface3 [date_of_birt=" + date_of_birt + "]";
    }
    
}