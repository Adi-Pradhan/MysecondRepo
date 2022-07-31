import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] mn=new int[m];
        for(int i=0;i<mn.length;i++){
            mn[i]=sc.nextInt();
        }
        for(int i=0;i<mn.length-1;i++){
            int min=mn[i];
            for(int j=i+1;j<mn.length;j++){
               if(min>mn[j]){
                    int test=min;
                    mn[i]=mn[j];
                    mn[j]=test;
               } 
            }
        }
        for(int i:mn){
            System.out.println(i);
        }
    }
}
