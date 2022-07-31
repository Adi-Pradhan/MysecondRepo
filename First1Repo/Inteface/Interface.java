interface printable{
    void print();
}
class employee implements printable{
    @Override
    public void print(){
        System.out.println("asd");
    }
}
class circle implements printable{
    public void print(){
        System.out.println("lkj");
    }
}
