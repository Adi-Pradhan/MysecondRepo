

interface sortable{
    void sortALL();
}
class interface2 implements sortable{
    private int[] arr;
    public interface2(int[] arr){
        this.arr=arr;
    }
    public static void main(String[] args) { 
        int[] arr={1,4,5,6,7};
        interface2 em=new interface2(arr);
        em.sortALL();
        
    }
    @Override
    public void sortALL() {
        int temp=0;
        
        for(int i=0;i<arr.length-1;i++){
            temp=0;
            for(int j=i+1;j<arr.length-i;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted arrayy is");
        for(int i:arr){
            System.out.print(i+" ,");
        }
        
    }
   
}
class circle implements sortable{
    public static void main(String[] args) {
        circle cs=new circle();
        cs.sortALL();
    }

    @Override
    public void sortALL() {
        int temp=0;
        int[] emp=new int[5];
        for(int i=0;i<emp.length-1;i++){
            temp=0;
            for(int j=i+1;j<emp.length-i;j++){
                if(emp[i]>emp[j]){
                    temp=emp[i];
                    emp[i]=emp[j];
                    emp[j]=temp;
                }
            }
        }
        System.out.println("sorted arrayy is");
        for(int i:emp){
            System.out.print(i+" ,");
        }
        
    }
}
