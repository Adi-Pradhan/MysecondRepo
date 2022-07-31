public class DeeoAssign2 {

    private static void FindItPresentInOrder(int i) {
        String s=Integer.toString(i);
        char[] ch=s.toCharArray();
        int count=1;
        for(int j=0;j<ch.length-1;j++){
            if(ch[j]<ch[j+1])
            {
                count=count+1;
                System.out.println(count);
            }
        }
        if(ch.length==count){
            System.out.println("number is in increasing order");
        }
        else
        System.out.println("number is not in increasing order");
    }
    public static void main(String[] args) {
        FindItPresentInOrder(123456);
    }

   
}
