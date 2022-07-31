public class Arrayseg {
    public static void main(String[] args) {
        int[] arr=new int[5];
        String b="aditya deep god known what will going to happen";
        arr[0]=5;
        arr[3]=23;
        arr[4]=38;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        String[] df=b.split(" ");
        for(String h:df){
            System.out.println(h);
        }
    }
}
